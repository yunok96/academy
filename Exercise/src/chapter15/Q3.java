package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q3 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("a.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("a.txt ������ �������");
	}
}
