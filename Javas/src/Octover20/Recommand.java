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
		System.out.println("坷全全 炼客侩");
		Recommand.count++;
	}
}

class downbutton{
	void dislike() {
		System.out.println("备傀俊竣");
		Recommand.count--;
	}
}