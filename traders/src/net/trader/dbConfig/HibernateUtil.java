package net.trader.dbConfig;
import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
        
    	private static final SessionFactory sessionFactory = buildSessionFactory();

    	private static SessionFactory buildSessionFactory() {
    		try {
    			return new Configuration().configure().buildSessionFactory();
    		} catch (Throwable ex) {
    			
    			throw new ExceptionInInitializerError(ex);
    		}
    	}

    	public static SessionFactory currentSession() {
    		return sessionFactory;
    	}
        
    	public static String getJarFolder() {
    		File currentJavaJarFile = new File(HibernateUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());   
    		String currentJavaJarFilePath = currentJavaJarFile.getAbsolutePath();
    		String currentRootDirectoryPath = currentJavaJarFilePath.replace(currentJavaJarFile.getName(), "");
    		return currentRootDirectoryPath.replaceAll("\\s", "%20");
    	  }
}

