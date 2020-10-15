package Octover12;
import java.util.ArrayList;
import java.util.List;

public class Fly {
	public static void main(String[] args) {
		List<Canfly> list = new ArrayList<Canfly>();
		Canfly f1 = new Airplane();
		Canfly f2 = new Bird();
		list.add(f1);
		list.add(f2);
		testFly(list);
	}
	static void testFly(List<Canfly> list) {
		for (Canfly aa : list) {
			aa.fly();
			aa.land();
		}
		/*for (Object obj : list) {
			((Canland)obj).land();
		}*/
	}
}
