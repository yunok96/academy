package chapter4;

public class Q1Switch {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("������ �����Դϴ�");
				return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");
	}

}
