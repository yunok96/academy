package Octover22;

public class Clac {

	public static void main(String[] args) {
		Lam lam = (a,b) -> a+b;//�������̽��� ������ = �μ� -> ���;
		System.out.println(lam.add(2, 3));
		
		Inter inter = new Inter() {//�������̽� ������(){������}
			public int bb() {
				return 0;
			}
		};
		System.out.println(inter.bb());
	}

}

interface Lam{
	public int add(int a, int b);
}
interface Inter{
	public int bb();
}