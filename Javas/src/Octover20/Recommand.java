package Octover20;

public class Recommand {
	
	static int count;

	public static void main(String[] args) {
		upbutton up = new upbutton();
		downbutton down = new downbutton();
		up.like();
		up.like();
		down.dislike();
		System.out.println(count);
	}

}

class upbutton{
	void like() {
		System.out.println("��ȫȫ ���Ϳ�");
		Recommand.count++;
	}
}

class downbutton{
	void dislike() {
		System.out.println("��������");
		Recommand.count--;
	}
}