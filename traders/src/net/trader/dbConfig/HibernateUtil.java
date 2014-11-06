package net.trader.dbConfig;
import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

        private static SessionFactory sessionFactory;
        
        static{
                try{
                        sessionFactory = new Configuration().configure().buildSessionFactory();
                }catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public static SessionFactory getSessionFactory() {
                return sessionFactory;
        }

        public static void shutdown(){
                getSessionFactory().close();
        }
        
        @SuppressWarnings("unchecked")
        public static final ThreadLocal session = new ThreadLocal();
        
        @SuppressWarnings("unchecked")
        public static Session currentSession(){
                Session s = (Session)session.get();
                if(s == null){
                        s = sessionFactory.openSession();
                        session.set(s);
                }
                return s;
        }
        
        @SuppressWarnings("unchecked")
        public static void closeSession(){
                Session s = (Session)session.get();
                if(s != null)
                        s.close();
                session.set(null);
        }
        
    	public static String getJarFolder() {
    		File currentJavaJarFile = new File(HibernateUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());   
    		String currentJavaJarFilePath = currentJavaJarFile.getAbsolutePath();
    		String currentRootDirectoryPath = currentJavaJarFilePath.replace(currentJavaJarFile.getName(), "");
    		return currentRootDirectoryPath.replaceAll("\\s", "%20");
    	  }
}

