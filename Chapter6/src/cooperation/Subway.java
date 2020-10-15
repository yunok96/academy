package cooperation;

public class Subway {
	 public String lineNumber;           // ����ö �뼱 ��ȣ
	 public int passengerCount;          // �°� �� 
	 public int money;                   // ���� ��
	    
	 public Subway(String lineNumber) {   // ����ö �뼱 �ʱ�ȭ
		  this.lineNumber = lineNumber;   
	 }
	    
	 public void take(int money) {         // �°��� ź ��� 
		  this.money += money;               // ���� ����
		  passengerCount++;                  // �°� �� ����
	 } 
	    
	 public void showInfo()              // ����ö ���� ���
	 {
		  System.out.println(lineNumber + "을 탔다." + passengerCount +"���̰�, ������ " + money + "�Դϴ�.");
	 }

}
