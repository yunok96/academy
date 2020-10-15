package MeMeMe;

public class Passenger {
	int money;
	Ticket ticket;
	public Passenger() {
		this.money = 10000;
	}
	public int buy() {
		return money-ticket.price;
	}
	public int Mynumber() {
		return this.ticket.serialNum;
	}
}
