package Octover23;

public class ExceptionCustom {
	public void checkNum(int num) throws LG, Samsung{//������ ����	
		if(num%2==1) {
			throw new LG("����");
		}
		else if(num%2==0) {
			throw new Samsung("�ܼ�");//�Ｚ �ͼ��ǿ� Ŀ���� �μ��� ����
		}
	}
	public static void main(String[] args) {
		
		ExceptionCustom ec = new ExceptionCustom();
		int a = Integer.valueOf(args[0]);
		System.out.println(a);
		try {
			ec.checkNum(3);
		} catch(LG | Samsung e) {//������ ĳġ��
			System.out.println(e.getMessage());
		}
	}
}
class Samsung extends Exception{
	Samsung(String ma) {//�ֻ����� �޼��� �ѱ�
		super(ma);
	}
}
class LG extends Exception{
	LG(String ma){
		super(ma);
	}
}