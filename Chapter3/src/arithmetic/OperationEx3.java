package arithmetic;

public class OperationEx3 {
	 public static void main(String[] args) {
		  int gameScore = 150;           // ���ӿ��� ȹ���� ������ 150��
		
		  int lastScore1 = ++gameScore;  // gameScore�� 1 ���� ���� lastScore1�� ����
		  int lastScore2 = --gameScore;   // gameScore���� 1�� �� ���� lastScore2�� ����
		
		  System.out.println(lastScore1);  // 151
		  System.out.println(lastScore2);  // 150
	 }
}

