package Octover22;

import java.io.FileInputStream;

public class ClassCast {
	
	String str;
	public static void main(String[] args) {
		ClassCast cc = new ClassCast();
//		try {
//			if(cc.str.equals("33")) {
//				System.out.println("����");
//			}
//		} catch(NullPointerException e){ ������Ʈ �߻����. ���°ſ� ����
//			System.out.println(e);
//		}
		try {
			if(cc.str.equals("33")) {
				System.out.println("����");
			}
		} catch(NullPointerException e){
			System.out.println(e);
		}
		try {
			Object faker = new String("ff");
			int fake2 = (int)faker;
			int aa = fake2;
		} catch(ClassCastException e){
			System.out.println(e);
		}
//		FileInputStream fis = null;
//		fis = new FileInputStream("a.text");
	}

}
