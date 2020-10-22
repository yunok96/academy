package Octover20;

public class Main {
	public static void main(String[] a) {
		Linkedlist number = new Linkedlist();
		number.addFirst(51);
		number.addLast(102);
		number.addLast(102);
		System.out.println(number);
		number.removeFirst();
		System.out.println(number);
	}
}
