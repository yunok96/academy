package MeMe;

public class Overwatch extends Game {
	
	Overwatch(){
		super.monthlyPayment=10000;
	}
	@Override
	void CheckPay(int a) {
		System.out.println("오버워치의 월정액 요금은 "+a);
	}

}
