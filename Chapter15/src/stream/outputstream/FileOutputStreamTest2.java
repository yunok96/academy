package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt",true);
		try(fos){ //java 9 ���� �����Ǵ� ���
		
			byte[] bs = new byte[26];
			byte data = 65;        //'A' �� �ƽ�Ű ��
			for(int i = 0; i < bs.length; i++){  // A-Z ���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);  //�迭 �Ѳ����� ����ϱ�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
