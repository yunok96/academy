package Octover23;

public class ExceptionCustom {
	public void checkNum(int num) throws LG, Samsung{//여러개 예외	
		if(num%2==1) {
			throw new LG("엘쥐");
		}
		else if(num%2==0) {
			throw new Samsung("쌤숭");//삼성 익셉션에 커스텀 인수로 던짐
		}
	}
	public static void main(String[] args) {
		
		ExceptionCustom ec = new ExceptionCustom();
		int a = Integer.valueOf(args[0]);
		System.out.println(a);
		try {
			ec.checkNum(3);
		} catch(LG | Samsung e) {//여러개 캐치함
			System.out.println(e.getMessage());
		}
	}
}
class Samsung extends Exception{
	Samsung(String ma) {//최상위로 메세지 넘김
		super(ma);
	}
}
class LG extends Exception{
	LG(String ma){
		super(ma);
	}
}