package Octover13;

public class Car {
	String name;
	void start() {
		System.out.println(this.name+" 시동 켬");
	}
	void drive() {
		System.out.println(this.name+" 달린다");
	}
	void stop() {
		System.out.println(this.name+" 멈춘다.");
	}
	void turnoff() {
		System.out.println(this.name+"시동 끈다.");
	}
	void carwash() {
		System.out.println("차 닦아라");
	}
	final void run() {
		start();
		drive();
		stop();
		turnoff();
		carwash();
	}
}
