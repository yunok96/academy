package chapter9.step1;

public class AutoCar extends Car{

	@Override
	public void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");		
	}

	@Override
	public void refuel() {
		System.out.println("�ֹ����� �����մϴ�.");
	}

	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
