package exception;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();//�ڵ����� ���� ����
		try (AutoCloseObj obj2 = obj){//�ڵ����� ���Ÿ� ����
			throw new Exception();
		}catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}
	}
}
