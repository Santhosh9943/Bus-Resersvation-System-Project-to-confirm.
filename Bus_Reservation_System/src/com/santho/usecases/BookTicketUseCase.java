package com.santho.usecases;

import java.util.Scanner;

import com.santho.dao.CustomerDao;
import com.santho.dao.CustomerDaoImpl;
import com.santho.exception.CustomerException;

public class BookTicketUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Mob No :");
		String mob = input.next();
		
		System.out.println("Enter Source location :");
		String source = input.next();
		
		System.out.println("Enter Destination :");
		String destination = input.next();
		
		System.out.println("Enter No of tickets :");
		int tickets = input.nextInt();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			String result = dao.bookTicket(mob, source, destination, tickets);
			
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
