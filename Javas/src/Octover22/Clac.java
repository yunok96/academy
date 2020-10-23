package Octover22;

public class Clac {

	public static void main(String[] args) {
		Lam lam = (a,b) -> a+b;//인터페이스명 변수명 = 인수 -> 결과;
		System.out.println(lam.add(2, 3));
		
		Inter inter = new Inter() {//인터페이스 생성자(){덮어씌울거}
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