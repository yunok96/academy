import java.util.Scanner;

public class first_java {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int java;
		int eng;
		int sum;
		System.out.println("�ڹ� ������ �Է��ϼ���.");
		java = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		eng = scan.nextInt();
		sum = (java + eng)/2;
		System.out.println(sum+"��");
		if(sum>70)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}

}
