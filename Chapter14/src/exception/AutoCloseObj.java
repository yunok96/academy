package exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {//자동 예외처리 선언
		System.out.println("리소스가 close() 되었습니다");
	}
}
