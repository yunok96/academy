package exception;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();//자동으로 쓸걸 생성
		try (AutoCloseObj obj2 = obj){//자동으로 쓸거를 받음
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}
