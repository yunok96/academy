package Octover22;

public class Tiger implements Runable {
	
	public void Run() {
		System.out.println("�� �����̶���");
	}
	
	public static void main(String[] a) {
		Tiger ti = new Tiger();
		ti.Run();
		Runable tig = new Runable() {//ȣ���� ����
			@Override
			public void Run() {//�������̵�
				System.out.println("�ٱ״�");
			}
		};
		tig.Run();
		Wing wi = new Wing() {
			@Override
			public void Fly() {
				System.out.println("�޷�");
			}
		};
		wi.Fly();
	}
}

interface Runable{
	void Run();
}

interface Wing{
	void Fly();
}