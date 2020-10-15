package MeMe;

public class Fruits {
	int Brix;
	Fruits(int num){
		this.Brix=num;
	}
	void Check() {
		System.out.println("조상 클래스 내부에서 실행됨 : 당도는 "+this.Brix);
	}
	void meme() {
		System.out.println("ff");
	}
}
