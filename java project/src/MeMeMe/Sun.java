package MeMeMe;

public class Sun {
	private Sun() {};
	private static Sun ins = new Sun();
	static String name="내 이름은 태양";
	public static Sun inst() {		
		return ins;
	}
}
