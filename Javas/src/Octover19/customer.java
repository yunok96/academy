package Octover19;

public class customer {
	void eat(Tonkatsu ton){
		System.out.println("�ȳ�. "+ton.calories);
	}
	public static void main(String[] a) {
		new customer().eat(new Tonkatsu());
	}
	
}

class Tonkatsu{
	int calories = 54;
}