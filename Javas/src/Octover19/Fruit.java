package Octover19;

public class Fruit {
	private int id;
	private String name;
	public Fruit(int a, String b) {
		id=a;
		name=b;
	}
	public int getNumber() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "번호는 "+id+", 이름은 "+name;
	}
}
