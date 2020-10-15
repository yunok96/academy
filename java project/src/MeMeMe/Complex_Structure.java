package MeMeMe;

public class Complex_Structure {

	public static void main(String[] args) {
		Floor fl = new Floor(1);
		Elevator el = new Elevator(1.1f, 5);
		Human hu = new Human("김민수", true, 7);
		hu.Sentence(el, fl);
	}

}
