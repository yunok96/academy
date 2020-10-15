package MeMeMe;
import java.util.ArrayList;

public class ttt {

	public static void main(String[] args) {
		ArrayList<Apple> apple = new ArrayList<Apple>();//제네릭 애플 클래스인 어레이 리스트를 만듬
		for(int i=0;i<100;i++) {//100번 반복
			apple.add(new Apple());//애플 어레이리스트에 애플 클래스를 100개 추가함
			apple.get(i).serialNum=i+1;//어레이 리스트의 각 애플 개체를 불러와서 시리얼 넘버 지정
		}
		for (Apple ap : apple) {//향상된 for문, foreach와 동일. apple의 어레이리스트 크기만큼 각 Apple를 반복
			//System.out.println(ap.serialNum);
		}
		ArrayList testing = new ArrayList(100);
		testing.add(1);
		testing.add("가나다라");
		System.out.println(testing.get(0));
		System.out.println(testing.get(1));
		//System.out.println(apple.size());
		//System.out.println(apple.get(98).serialNum);

	}

}
