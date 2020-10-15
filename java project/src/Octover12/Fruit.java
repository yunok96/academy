package Octover12;

public class Fruit implements Edible {
	public void Eat() {
		System.out.println("먹을 수 있는가?"+Edible.canEat);
	}
	int price;
	void getPrice() {
		System.out.println("이 과일의 가격은 "+price+"이다.");
	}
}
