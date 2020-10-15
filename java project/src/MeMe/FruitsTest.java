package MeMe;

public class FruitsTest {

	public static void main(String[] args) {
		Fruits melfru = new Melon();
		Melon f = (Melon)melfru;
		f.onlymelon();

	}
	void test(Fruits fr) {//메소드 다형성의 장점 : 최종 클래스에서 한번만 실행하면 됨.
		System.out.println("당도는 "+fr.Brix);//사과 10, 바나나 15, 멜론 20 으로 고정됨.
	}

}
