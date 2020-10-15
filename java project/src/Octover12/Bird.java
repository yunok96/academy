package Octover12;

public class Bird implements Canfly,Canland {
	public void fly() {
		System.out.println(Canfly.speed*1);
	}
	public void land() {
		System.out.println(Canland.foot);
	}
}
