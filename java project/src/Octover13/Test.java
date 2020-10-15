package Octover13;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		RoundRobin rr = new RoundRobin();
		rr.getCall();
		System.out.println("다음 행동 결정 : R-라운드로빈, L-취소");
		int ch=System.in.read();
		if(ch=='R') {
			rr.assignment();
		}
		else if(ch=='L') {
			System.out.println("취소");
		}
		else {
			System.out.println("부정한 접근");
		}
	}

}
