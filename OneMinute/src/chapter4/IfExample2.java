package chapter4;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 60;
		int charge;
		
		if(age < 8){
			charge = 1000; 
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if(age < 14){
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age < 20){
			charge = 2500;
			System.out.println("��, ����л� �Դϴ�.");
		}
		else if(age >= 60) {
			charge = 0;
			System.out.println("��� ����Դϴ�.");
		}
		else{
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		} 
		
		System.out.println("������ " + charge + "���Դϴ�.");
	}
}
