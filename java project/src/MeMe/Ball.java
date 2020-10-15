package MeMe;

public class Ball {
	protected String color;
	protected double size;
	Ball(){
		System.out.println("공이 만들어졌다.");
	}
	void info() {
		System.out.println(color+", "+size);
	}
}
