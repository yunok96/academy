package Octover22;

public class ETCs {
	
	interf getinter(int i){
		int num = 100;
		return new interf() {
				
		@Override
		public void s() {
			//num = 200;   //���� ��
			//i = 10;      //���� ��
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	
	interf real = new interf() {
		@Override
		public void s() {
			System.out.println("�ٽ� �������̵�");
		}
	};
	
	public static void main(String[] a) {
		ETCs et = new ETCs();
		interf getin = et.getinter(51);
		getin.s();
		et.real.s();
	}
}

interface interf{
	
	void s();
}