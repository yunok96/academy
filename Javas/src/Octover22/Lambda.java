package Octover22;

import java.util.List;
import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayUtil getSize = (int[] ar)->ar.length;
		System.out.println(getSize.getSize(arr));
		
		List<Object> arrl = new ArrayList<Object>();
		for (int i = 0; i < 10; i++) {//�ݺ�
			arrl.add(5);
		}
		AL al = (List<Object> arl)->arl.size();
		System.out.println(al.getSi(arrl));
	}
}

@FunctionalInterface//���̸� �߻�޼��� 2���϶� ���ٽ� �ȵȴٰ� ��� ǥ������
interface ArrayUtil{
	public int getSize(int[] ar);
}

interface AL{
	public int getSi(List<Object> al);
}