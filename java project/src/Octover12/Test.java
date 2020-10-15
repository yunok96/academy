package Octover12;

import Octover13.Genesis;

public class Test extends Genesis {

	public static void main(String[] args) {//num을 반지름으로 가지는 원의 넓이 구하기
		double num = 4.0;
		double area = Constants.SQUARE(num)*Constants.PI;
		System.out.println("반지름이 "+num+"인 원의 넓이는 "+area+"입니다.");
		String ff = Interface.im;
		System.out.println(new Test()==new Test());
		
		
	}

}
