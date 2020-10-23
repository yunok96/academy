package Octover23;

public enum Star {
	Icecoffee("아이스커피",5000),
	Caffeelatte("카페라떼",4000);
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
			System.out.println("뭔지 모르겠다");
			return 0;
		}
		
	}
}
