package Octover13;
import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carlist = new ArrayList<Car>();
		carlist.add(new Genesis());
		carlist.add(new Sonata());
		for(Car car : carlist) {
			car.run();
			System.out.println("============");
		}

	}

}
