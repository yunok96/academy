import java.util.Scanner;

public class first_java {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int java;
		int eng;
		int sum;
		System.out.println("자바 점수를 입력하세요.");
		java = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();
		sum = (java + eng)/2;
		System.out.println(sum+"점");
		if(sum>70)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
