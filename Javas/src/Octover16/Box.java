package Octover16;

public class Box<T extends Fruit> {
	
	private T mat;
	
	public T getType() {
		return mat;
	}
	public void setType(T mat) {
		this.mat = mat;
	}
	
	public static void main(String[] ars) {
		
		Box<Banana> boxba = new Box<>();
		boxba.setType(new Banana());
		boxba.getType().sour();
		
		Box<Apple> boxap = new Box<>();
		boxap.setType(new Apple());
		boxap.getType().sour();
		
		//Box<Computer> boxcom = new Box<>(); 제네릭 상속이 없는 클래스라서 설정 불가능
		
	}
}

class Computer{
	
}