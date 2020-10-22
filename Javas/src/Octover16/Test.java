package Octover16;

public class Test implements Testing {
	public void prpr() {
		System.out.println("ff");
	}
	public int que() {
		return 1+Testing.PI;
	}
	public static void main(String[] args) {
		Testing te = new Test();
		Test tes = new Test();
		te.prpr();
		tes.que();
	}
}
