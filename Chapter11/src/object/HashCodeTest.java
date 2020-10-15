package object;

import java.util.Date;

public class HashCodeTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = new String("ab");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}
}
