package Octover22;

public class ETCs {
	
	interf getinter(int i){
		int num = 100;
		return new interf() {
				
		@Override
		public void s() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	
	interf real = new interf() {
		@Override
		public void s() {
			System.out.println("다시 오버라이드");
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