package Octover23;

public enum Star {
	Icecoffee("���̽�Ŀ��",5000),
	Caffeelatte("ī���",4000);
	private final String name;
	private final int price;
	
	Star(String name, int price){
		this.name=name;
		this.price=price;
	}
	public int getPrice(String n) {
		if(n==this.name) {
			return this.price;
		}
		else {
			System.out.println("���� �𸣰ڴ�");
			return 0;
		}
		
	}
}
