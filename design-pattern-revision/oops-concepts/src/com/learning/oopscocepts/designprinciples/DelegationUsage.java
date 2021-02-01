package com.learning.oopscocepts.designprinciples;

public class DelegationUsage {
	public static void main(String[] args) {
		//Ticketbooker booker = new Ticketbooker(new FlightTicketbooker());
		Ticketbooker booker = new Ticketbooker(new TrainTicketbooker());

		booker.bookTicket();
	}
}

interface IticketBooker {
	void bookTicket();
}

class TrainTicketbooker implements IticketBooker {

	@Override
	public void bookTicket() {
		System.out.println("train ticket booked");
	}

}

class FlightTicketbooker implements IticketBooker {

	@Override
	public void bookTicket() {
		System.out.println("flight ticket booked");
	}

}

class Ticketbooker implements IticketBooker {

	private IticketBooker booker;

	public Ticketbooker(IticketBooker booker) {
		this.booker = booker;
	}

	// just a delegation ;like decorate pattern
	@Override
	public void bookTicket() {
		booker.bookTicket();
	}

}