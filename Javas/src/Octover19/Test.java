package Octover19;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] ar) {
		Box te = new Box();
		Fruit ap = new Apple(101, "부사");
		Fruit or = new Apple(102, "어렌쥐");
		Fruit ap2 = new Apple(101, "능금");
		te.add(ap);
		te.add(or);
		te.add(ap2);
		for (Fruit fr : te.arr) {
			System.out.println(fr);
		}
	}
}

class Box{//클래스 생성할때 새로 클릭하기 귀찮아서 아래에 만듬.
	ArrayList<Fruit> arr;//뒤의 제네릭 생략
	public Box() {//레이지 로딩? 암튼 늦게 만듬.
		arr = new ArrayList<>();
	}
	public void add(Fruit newId) {
		int tempId = newId.getNumber();//일단 넣어둘 번호 저장해둠
		for (Fruit fruit : arr)
		{
			if(tempId==fruit.getNumber())//번호가 같다고?
			{
				System.out.println("이미 같은 번호의 과일이 있습니다 : "+fruit.getNumber()+"번, "+fruit.getName());
				return;//메세지 출력 후에 메서드 바로 끊어줌. 그러면 아래 실행 안됨.
			}
		}
		arr.add(newId);
	}
}