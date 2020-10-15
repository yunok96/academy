package Octover14;

public class ssd {
	public static void main(String[] args) {
		int a = 1;
	    int b = 2;
	    swap(a, b);
	    
	    System.out.println(a); //출력결과 1
	    System.out.println(b); //출력결과 2
	}
	
	static void swap(int a, int b) {
	    int tmp = a;
	    a = b;
	    b = tmp;
	}
}
