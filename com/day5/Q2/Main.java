package com.day5.Q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Ticket ticket1 = new Ticket();
		
		Scanner t1 = new Scanner(System.in);
		
		System.out.println("Enter the No of Booking");
		int noOfbooking =  t1.nextInt();
		
		System.out.println("Enter the Available tickets");
		int availTic = t1.nextInt();
		
		System.out.println("Enter the Ticket id");
		int ticketid   =  t1.nextInt();
		
		System.out.println("Enter the Price");
		int price =  t1.nextInt();
		
		System.out.println("Enter the No ticket ");
		int noOfTicket = t1.nextInt();
		
				
		ticket1.setTicketid(ticketid);
		Ticket.setAvailableTickets(availTic);
		ticket1.setPrice(price);
		
		int amount  =  ticket1.calculateTicketCost(noOfTicket);

	
		
		System.out.println("Total Amount : " + amount );
		System.out.println("Available ticket after booking : " + Ticket.getAvailableTickets() );
		
		
		
	}
}
