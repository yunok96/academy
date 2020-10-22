package Octover21;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] a) {
		Box bo = new Box();
		bo.addAp(new Apple(12,12));
		bo.addAp(new Apple(12,12));
		bo.addAp(new Apple(15,13));
		bo.addAp(new Apple(13,10));
		bo.removeAp(16);
		bo.showAll();
		
	}
}

class Box{
	private HashSet<Apple> hash;
	public Box() {
		hash = new HashSet<Apple>();//�ؽ��� ����
	}
	public void addAp(Apple ap) {//ap�� �ؽ��� add�� ����
		hash.add(ap);
	}
	public boolean removeAp(int serialNum) {//�����
		Iterator<Apple> ir = hash.iterator();//���ͷ����� ���
		while(ir.hasNext()) {//������ ���Ƽ� ���� ��ȣ�� ������ �����ϰ� true ��ȯ
			Apple apple = ir.next();//�ø��� �ѹ��� ������ ����
			int tempNum = apple.serialNum;
			if(tempNum==serialNum) {
				hash.remove(apple);
				return true;
			}
		}
		System.out.println(serialNum);
		return false;
	}
	public void showAll() {
		for (Apple apple : hash) {
			System.out.println(apple.date);
		}
	}
}

class Apple{
	int serialNum;
	int date;
	public Apple(int ser, int date) {
		this.serialNum=ser;
		this.date=date;
	}
	public int hashCode() {//�ø���ѹ��� �ؽ��ڵ�� ����
		return serialNum;
	}
	public boolean equals(Object obj) {//������ ������. �ؽ��ڵ尡 ���ٸ� true ��ȯ
		if(this.hashCode()==((Apple)obj).hashCode()) {
			return true;
		}
		else {
			return false;			
		}
	}
}