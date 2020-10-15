package Octover15;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("얘! 숫자를 입력하렴!");
		String str = sca.next();
		System.out.println("또 입력하렴!");
		String str2 = sca.next();
		int a = Integer.valueOf(str);//밸류오브 사용
		a+=Integer.parseInt(str2);//파스인트 사용
		System.out.println(a);
	}

}
