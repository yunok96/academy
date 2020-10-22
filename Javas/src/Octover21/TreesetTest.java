package Octover21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {

}

class Box2{
	private TreeSet<Nasi> tree;
	public Box2() {
		tree = new TreeSet<Nasi>();//�ؽ��� ����
	}
	public void addAp(Nasi ap) {//ap�� �ؽ��� add�� ����
		tree.add(ap);
	}
	public boolean removeAp(int serialNum) {//�����
		Iterator<Nasi> ir = tree.iterator();//���ͷ����� ���
		while(ir.hasNext()) {//������ ���Ƽ� ���� ��ȣ�� ������ �����ϰ� true ��ȯ
			Nasi nasi = ir.next();//�ø��� �ѹ��� ������ ����
			int tempNum = nasi.serialNum;
			if(tempNum==serialNum) {
				tree.remove(nasi);
				return true;
			}
		}
		System.out.println(serialNum);
		return false;
	}
	public void showAll() {
		for (Nasi nasi : tree) {
			System.out.println(nasi.date);
		}
	}
}

class Nasi{
	int serialNum;
	int date;
	public Nasi(int ser, int date) {
		this.serialNum=ser;
		this.date=date;
	}
	public int hashCode() {//�ø���ѹ��� �ؽ��ڵ�� ����
		return serialNum;
	}
	public boolean equals(Object obj) {//������ ������. �ؽ��ڵ尡 ���ٸ� true ��ȯ
		if(this.hashCode()==((Nasi)obj).hashCode()) {
			return true;
		}
		else {
			return false;			
		}
	}
}