package MeMeMe;

public class TestSun {

	public static void main(String[] args) {
		Sun con1 = Sun.inst();
		Sun con2 = Sun.inst();
		System.out.println(con1==con2);
	}

}
