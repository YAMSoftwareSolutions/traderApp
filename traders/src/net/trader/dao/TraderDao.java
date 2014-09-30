package net.trader.dao;

import net.traders.to.TraderTo;

public interface TraderDao {
	public TraderTo insert(TraderTo traderTo);
	public TraderTo update(int id, TraderTo traderTo);
	public TraderTo search(String invoiceNumber);
	public boolean delete(int id);

}
