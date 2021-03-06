package net.trader.daoimpl;

import javax.swing.JOptionPane;

import net.trader.dao.TraderDao;
import net.trader.dbConfig.HibernateUtil;
import net.traders.orm.MeterialDescriptionOrm;
import net.traders.orm.TraderOrm;
import net.traders.to.MeterialDescriptionTO;
import net.traders.to.TraderTo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TraderDaoimpl implements TraderDao{

	@Override
	public TraderTo insert(TraderTo traderTo) {
		//Get Session Factory
        Session session = HibernateUtil.currentSession().openSession();
        Transaction tx = session.beginTransaction();
        //Parent Data
        TraderOrm traderOrm=new TraderOrm();
        traderOrm.setAddress(traderTo.getAddress());
        traderOrm.setInvoiceNumber(traderTo.getInvoiceNumber());
        traderOrm.setName(traderTo.getName());
        traderOrm.setPartyTINNo(traderTo.getPartyTINNo());
        traderOrm.setPhoneNumber(traderTo.getPhoneNumber());
        traderOrm.setVehicleNumber(traderTo.getVehicleNumber());
        traderOrm.setTax(traderTo.getTax());
        traderOrm.setTotalAmount(traderTo.getTotalAmount());        
        traderOrm.setTotal(traderTo.getTotal());
        traderOrm.setDate(traderTo.getDate());
        //
        session.save(traderOrm);
        //Chaild Data
       for(MeterialDescriptionTO  meterialDescriptionTO:traderTo.getobjMeterialDescriptionTo()){
        MeterialDescriptionOrm meterialDescriptionOrm=new MeterialDescriptionOrm();
        meterialDescriptionOrm.setMeterialDescription(meterialDescriptionTO.getMeterialDescription());
        meterialDescriptionOrm.setUnit(meterialDescriptionTO.getUnit());
        meterialDescriptionOrm.setQuantity(meterialDescriptionTO.getQuantity());
        meterialDescriptionOrm.setAmount(meterialDescriptionTO.getAmount());
        meterialDescriptionOrm.setTraderOrm(traderOrm);
        traderOrm.getObjMeterialDescriptionOrms().add(meterialDescriptionOrm);
        session.persist(meterialDescriptionOrm);
       }
       //
       tx.commit();
       session.close();
       
		return traderTo;
	}

	@Override
	public TraderTo update(int id, TraderTo traderTo) {
		//Get Session Factory
        Session session = HibernateUtil.currentSession().openSession();
        Transaction tx = session.beginTransaction();
        //Parent Data
        TraderOrm traderOrm=(TraderOrm) session.load(TraderOrm.class, new Integer(id));
        traderOrm.setAddress(traderTo.getAddress());
        traderOrm.setInvoiceNumber(traderTo.getInvoiceNumber());
        traderOrm.setName(traderTo.getName());
        traderOrm.setPartyTINNo(traderTo.getPartyTINNo());
        traderOrm.setPhoneNumber(traderTo.getPhoneNumber());
        traderOrm.setVehicleNumber(traderTo.getVehicleNumber());
        traderOrm.setTax(traderOrm.getTax());
        traderOrm.setTotalAmount(traderOrm.getTotalAmount());
        traderOrm.setTotalAmount(traderOrm.getTotal());
        //Chaild Data
       for(MeterialDescriptionTO  meterialDescriptionTO:traderTo.getobjMeterialDescriptionTo()){
        MeterialDescriptionOrm meterialDescriptionOrm=new MeterialDescriptionOrm();
        meterialDescriptionOrm.setMeterialDescription(meterialDescriptionTO.getMeterialDescription());
        meterialDescriptionOrm.setQuantity(meterialDescriptionTO.getQuantity());
        meterialDescriptionOrm.setUnit(meterialDescriptionTO.getUnit());
        meterialDescriptionOrm.setAmount(meterialDescriptionTO.getAmount());
        meterialDescriptionOrm.setTraderOrm(traderOrm);
        traderOrm.getObjMeterialDescriptionOrms().add(meterialDescriptionOrm);
       }
       //
       tx.commit();
       session.close();
       
		return traderTo;
	}

	@Override
	public TraderTo search(String invoiceNumber) {
		//Get Session Factory
        Session session = HibernateUtil.currentSession().openSession();
        TraderOrm traderOrm=(TraderOrm) session.createCriteria(TraderOrm.class).add(Restrictions.like("invoiceNumber", invoiceNumber)).uniqueResult();
        if(traderOrm != null){
        	TraderTo traderTo=new TraderTo();
        	//
        	traderTo.setAddress(traderOrm.getAddress());
        	traderTo.setInvoiceNumber(traderOrm.getInvoiceNumber());
        	traderTo.setName(traderOrm.getName());
        	traderTo.setPartyTINNo(traderOrm.getPartyTINNo());
        	traderTo.setPhoneNumber(traderOrm.getPhoneNumber());
        	traderTo.setTax(traderOrm.getTax());
        	traderTo.setTotal(traderOrm.getTotal());
        	traderTo.setTotalAmount(traderOrm.getTotalAmount());
        	traderTo.setVehicleNumber(traderOrm.getVehicleNumber());
        	for(MeterialDescriptionOrm meterialDescriptionOrm:traderOrm.getObjMeterialDescriptionOrms()){
        		MeterialDescriptionTO meterialDescriptionTO=new MeterialDescriptionTO();
        		meterialDescriptionTO.setMeterialDescription(meterialDescriptionOrm.getMeterialDescription());
        		meterialDescriptionTO.setQuantity(meterialDescriptionOrm.getQuantity());
        		meterialDescriptionTO.setUnit(meterialDescriptionOrm.getUnit());
        		meterialDescriptionTO.setAmount(meterialDescriptionOrm.getAmount());
        		traderTo.getobjMeterialDescriptionTo().add(meterialDescriptionTO);
        	}
        	//		
        	session.close();
        	return traderTo;
        }else{
			Object[] options = {"OK"};
			int n = JOptionPane.showOptionDialog(null,
					"Invalid Invoice Number","Warning",
					JOptionPane.PLAIN_MESSAGE,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					options,
					options[0]);
			return null;
        }
	}

	@Override
	public boolean delete(int id) {
		return false;
	}
}
