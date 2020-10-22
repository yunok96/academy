package Octover16;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random ran = new Random();
		//��� ����Ʈ ���� ���ѵ� �׳� �迭�� ��
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++)
		{
			int ranNum = ran.nextInt(15) + 1;
			boolean overlap = false;
			for (int j : num)
			{
				if(j == ranNum)
				{
					overlap = true;
				}
				while(overlap)
				{
					ranNum = ran.nextInt(15) + 1;
					if(ranNum != j)
					{
						overlap = false;
					}
				}
			}
			num[i] = ranNum;
		}
		System.out.print("��õ ��ȣ�� ");
		for (int i : num)
		{
			System.out.print(i+" ");
		}
	}
}
