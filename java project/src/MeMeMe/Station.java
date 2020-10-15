package MeMeMe;
import java.util.ArrayList;

public class Station {
	ArrayList<Ticket> ticket;
	public Station() {
		this.ticket=new ArrayList<Ticket>();
		for(int i=0;i<100;i++) {
			this.ticket.add(new Ticket());
			this.ticket.get(i).serialNum=i+2020;
		}
	}
	public int howManyTicket() {
		return this.ticket.size();
	}
}
