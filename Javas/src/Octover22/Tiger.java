package Octover22;

public class Tiger implements Runable {
	
	public void Run() {
		System.out.println("난 구현이란다");
	}
	
	public static void main(String[] a) {
		Tiger ti = new Tiger();
		ti.Run();
		Runable tig = new Runable() {//호랭이 생략
			@Override
			public void Run() {//오버라이드
				System.out.println("다그닥");
			}
		};
		tig.Run();
		Wing wi = new Wing() {
			@Override
			public void Fly() {
				System.out.println("펄럭");
			}
		};
		wi.Fly();
	}
}

interface Runable{
	void Run();
}

interface Wing{
	void Fly();
}