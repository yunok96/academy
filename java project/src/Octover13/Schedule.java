package Octover13;

public interface Schedule {
	
	int ss = 1;
	void getCall();
	void assignment();
	default void def() {
		System.out.println("이건 디폴트 메서드다");
	}
	static int rerr() {
		int tt=0;
		tt++;
		return tt;
	}
}
