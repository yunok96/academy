package Octover19;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] ar) {
		Box te = new Box();
		Fruit ap = new Apple(101, "�λ�");
		Fruit or = new Apple(102, "���");
		Fruit ap2 = new Apple(101, "�ɱ�");
		te.add(ap);
		te.add(or);
		te.add(ap2);
		for (Fruit fr : te.arr) {
			System.out.println(fr);
		}
	}
}

class Box{//Ŭ���� �����Ҷ� ���� Ŭ���ϱ� �����Ƽ� �Ʒ��� ����.
	ArrayList<Fruit> arr;//���� ���׸� ����
	public Box() {//������ �ε�? ��ư �ʰ� ����.
		arr = new ArrayList<>();
	}
	public void add(Fruit newId) {
		int tempId = newId.getNumber();//�ϴ� �־�� ��ȣ �����ص�
		for (Fruit fruit : arr)
		{
			if(tempId==fruit.getNumber())//��ȣ�� ���ٰ�?
			{
				System.out.println("�̹� ���� ��ȣ�� ������ �ֽ��ϴ� : "+fruit.getNumber()+"��, "+fruit.getName());
				return;//�޼��� ��� �Ŀ� �޼��� �ٷ� ������. �׷��� �Ʒ� ���� �ȵ�.
			}
		}
		arr.add(newId);
	}
}