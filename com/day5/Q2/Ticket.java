package com.day5.Q2;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	
	public int calculateTicketCost(int nooftickets) {
		
		int total_amount = 0;
		
		if (Ticket.availableTickets == 0) {
			return -1;
		}
		
		if (Ticket.availableTickets > nooftickets) {
			Ticket.availableTickets = Ticket.availableTickets - nooftickets;
			
			 total_amount = nooftickets * this.price;
			
		}
		return total_amount;
		
		
		
	}
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getTicketid() {
		return ticketid;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public static void setAvailableTickets(int availableTickets) {
		
		if (availableTickets <= 0) {
			System.out.println("Invalid ticket Number");			
		}
		else {
			Ticket.availableTickets = availableTickets;
		}
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	

	
}
