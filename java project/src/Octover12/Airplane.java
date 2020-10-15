package Octover12;

public class Airplane implements Canfly,Canland {
	public void fly() {
		System.out.println(Canfly.speed*10);
	}
	public void land() {
		System.out.println(Canland.foot*11);
	}
}
