package net.trader.services;

import java.util.Calendar;

import net.trader.dbConfig.HibernateUtil;
import net.traders.orm.TraderOrm;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

public class AutoGeneratedCode {
	private Calendar date ;
	public  String getCurrentYearMonth(){
		date = Calendar.getInstance();
		Integer year=date.get(Calendar.YEAR);
		Integer month=date.get(Calendar.MONTH);
		if(month.toString().length()!=2){
			return year.toString().substring(2,4)+"0"+month.toString();
		}
		return year.toString().substring(2,4)+month.toString();
	}
	public String getPerviousnumber(){
		DetachedCriteria maxidoftheinvoicenumber = DetachedCriteria.forClass(TraderOrm.class)
				.setProjection( Property.forName("id").max() )
				.add(Restrictions.like("invoiceNumber", this.getCurrentYearMonth(),MatchMode.START));

		Session session = HibernateUtil.currentSession().openSession();

		try{
			String previousInvoiceNumber=session.createCriteria(TraderOrm.class)
					.add( Property.forName("id").eq(maxidoftheinvoicenumber) )
					.setProjection(Projections.property("invoiceNumber"))
					.uniqueResult().toString();
			Integer generatedNumber=Integer.parseInt(previousInvoiceNumber.substring(4, previousInvoiceNumber.length()))+1;
			
			return this.getCurrentYearMonth()+generatedNumber.toString();
			
		}catch(Exception exception){
			return this.getCurrentYearMonth()+"1";
		}
	}
}
