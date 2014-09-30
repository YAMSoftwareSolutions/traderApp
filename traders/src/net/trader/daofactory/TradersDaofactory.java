package net.trader.daofactory;

import net.trader.dao.TraderDao;
import net.trader.daoimpl.TraderDaoimpl;

public class TradersDaofactory {
	private static TraderDao traderDao;
	static{
		traderDao=new TraderDaoimpl();
	}
	public static TraderDao getTraderDao() {
		return traderDao;
	}
}
