package net.trader.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ReportGeneration {

    public ReportGeneration() {
    }

    private void start() {
        try {                                            
            // report location
        	String reportSource = "/home/vijay/Documents/traderApp/traders/src/net/trader/start/traders.jrxml";
        	
        	//fill The Parent Data
        	Map<String, Object> parentMap=new HashMap<String,Object>();
        	parentMap.put("invoiceNo", getRandomString());
        	
            // fill Child report
            List<Map<String,?>> childmaps = new ArrayList<Map<String, ?>> (); 
            for (int i = 0; i < 3; i++) {
                Map<String,Object> map = new HashMap<String, Object>();
                map.put("quantity", getRandomString());
                map.put("unitRate", getRandomString());
                map.put("amount", getRandomString());
                map.put("meterialDescription", getRandomString());
                map.put("sno", getRandomString());
                childmaps.add(map);
            }            
            JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(childmaps);
            // compile report
            JasperReport jasperReport = (JasperReport)  JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parentMap, dataSource);
            // view report to UI
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    private String getRandomString(){
        return UUID.randomUUID().toString();
    }
    public static void main(String[] args) {
    	ReportGeneration main = new ReportGeneration();
        main.start();
    }
}
