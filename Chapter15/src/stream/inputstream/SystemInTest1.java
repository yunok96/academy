package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
