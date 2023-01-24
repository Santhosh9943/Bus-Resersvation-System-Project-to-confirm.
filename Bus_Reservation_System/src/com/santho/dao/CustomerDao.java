package com.santho.dao;

import java.util.List;

import com.santho.bean.Bus;
import com.santho.bean.Customer;
import com.santho.exception.BusException;
import com.santho.exception.CustomerException;

public interface CustomerDao {

	public String login(int AdId, String password)throws CustomerException;
	
	public List<Bus> showBuses() throws BusException;
	
	public String bookTicket(String mob,String source,String destintion,int tickets) throws CustomerException;

    public String cancelTicket(String mob) throws CustomerException;
}
