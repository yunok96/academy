package chapter4;

public class BreakExample1 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
	
		for(num=1; ; num++){
			sum += num;
			if(sum >= 500) 
				break;
		}
		
		System.out.println("num : " + num);
		System.out.println("sun : " +sum);
	}

}