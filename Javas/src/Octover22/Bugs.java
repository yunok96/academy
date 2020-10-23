package Octover22;

public class Bugs {
	public static void main(String[] arg) {
//		A a = new A();
//		try {
//			a.pro();
//		}
//		catch(Exception e){
//			System.out.println("관리자가 잡음");
//			e.printStackTrace();
//		}
		int[] a = new int[2];
		try {
			System.out.println(a[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("버러지");
			e.printStackTrace();
		}
		System.out.println(2);
	}
}

class A{
	void pro() throws Exception {
		try {
			new B().pro();
		} catch(NullPointerException e) {
			System.out.println("야 벌레잡았다");
			e.printStackTrace();
		}
	}
}
class B{
	void pro() throws Exception {
		new C().pro();
	}	
}
class C{
	void pro() throws Exception {
		System.out.println("버그 발생");
		throw new ClassCastException();
	}
}