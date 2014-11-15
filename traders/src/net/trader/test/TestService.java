package net.trader.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.trader.dbConfig.HibernateUtil;
import net.traders.orm.MeterialDescriptionOrm;
import net.traders.orm.TraderOrm;

public class TestService {
	public static void main(String[] args) {
        Session session = HibernateUtil.currentSession().openSession();
        Transaction tx = session.beginTransaction();
        TraderOrm traderOrm=new TraderOrm();
        traderOrm.setAddress("Trader");
        traderOrm.setInvoiceNumber("traderOrm");
        traderOrm.setName("traderOrm");
        traderOrm.setPartyTINNo("traderOrm");
        traderOrm.setPhoneNumber("traderOrm");
        traderOrm.setVehicleNumber("traderOrm");
        
        //session
        session.save(traderOrm);
        
        //
        MeterialDescriptionOrm meterialDescriptionOrm=new MeterialDescriptionOrm();
        meterialDescriptionOrm.setMeterialDescription("meterialDescriptionOrm");
        meterialDescriptionOrm.setQuantity("qty");
        meterialDescriptionOrm.setAmount(100.0);
        meterialDescriptionOrm.setTraderOrm(traderOrm);
        
        traderOrm.getObjMeterialDescriptionOrms().add(meterialDescriptionOrm);
        
        session.persist(meterialDescriptionOrm);
        
        
        tx.commit();
        session.close();
	}
}
