package Octover22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class Quiz {
	
	public void Quiz1() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			arr.add(i);
		}
		arr.stream().filter(n->n.intValue()>50).filter(n->n.intValue()%2==0).forEach(n->System.out.println(n));//���⺹��
		
	}
	
	public void Quiz2() {//����, �̸� �޾Ƽ� 5000�� �̻��� ��ǰ�� �̸��� ������������ ���
		List<Merchan> li = new ArrayList<Merchan>();
		//Map<Integer, String> merch = new HashMap<Integer, String>();
		li.add(new Merchan(4350, "��Ǫ�ν�Ʈ"));
		li.add(new Merchan(49550, "��"));
		li.add(new Merchan(5100, "ũ��"));
		li.add(new Merchan(5100, "ũ����"));
		li.add(new Merchan(4000, "ȫ��"));
		li.add(new Merchan(6000, "����"));
		li.add(new Merchan(5001, "����"));
		
		li.stream().filter(m->m.price>5000).sorted().forEach(m->System.out.println(m.name));;
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();
		//q.Quiz1();
		q.Quiz2();
	}
}

class Merchan implements Comparable<Merchan> {
	int price;
	String name;
	public Merchan(int price,String name) {
		this.price=price;
		this.name=name;
	}
	public int compareTo(Merchan mer) {
		return this.price-mer.price;
	}
}