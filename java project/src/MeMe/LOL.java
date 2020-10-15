package MeMe;

public class LOL extends Game {
	LOL(){
		super.monthlyPayment=3000;
	}
	@Override
	void CheckPay(int a) {
		System.out.println("리그 오브 레전드의 월정액 요금은 "+a);
	}
}
