package MeMe;

public class Battleground extends Game {
	Battleground(){
		super.monthlyPayment=8000;
	}
	@Override
	void CheckPay(int a) {
		System.out.println("배틀그라운드의 월정액 요금은 "+a);
	}
}
