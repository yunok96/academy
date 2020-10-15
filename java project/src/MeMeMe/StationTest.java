package MeMeMe;
import java.util.ArrayList;

public class StationTest {

	public static void main(String[] args) {
		Station station = new Station();
		ArrayList<Passenger> pass = new ArrayList<Passenger>();
		for(int i=0;i<30;i++) {
			pass.add(new Passenger());
			pass.get(i).ticket=station.ticket.get(0);
			station.ticket.remove(0);
		}
		System.out.println("역 안에 남아있는 티켓 수 : "+station.howManyTicket());
		

	}

}
