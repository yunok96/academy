package Octover21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTest {
	HashMap<Integer, Sonata> hm;
	public HashmapTest(){
		hm = new HashMap<Integer, Sonata>();
	}
	public void add(Sonata so) {
		hm.put(so.serial, so);
	}
	public boolean remove(int s) {
		if(hm.containsKey(s)) {
			hm.remove(s);
			return true;
		}
		System.out.println("없다");
		return false;
	}
	public void showAll() {
		Iterator<Integer> ir = hm.keySet().iterator();
		while(ir.hasNext()) {//다음 요소가 존재하면
			int key = ir.next();//다음으로
			Sonata so = hm.get(key);//키 받음
			System.out.println(so);//출력
		}
	}
	
	public static void main(String[] a) {
		HashmapTest hm = new HashmapTest();
		hm.add(new Sonata(12,"Red"));
		hm.add(new Sonata(13,"Blue"));
		hm.add(new Sonata(15,"Green"));
		hm.add(new Sonata(10,"Red"));
		hm.showAll();
		hm.remove(10);
		hm.remove(16);
		hm.add(new Sonata(12,"Black"));
		hm.showAll();
		
		HashMap<Integer, String> ha = new HashMap<Integer, String>();
		ha.put(12, "Red");
		ha.put(33, "Blue");
		System.out.println(ha.get(12));
		System.out.println(ha.get(33));
	}
}

class Sonata{
	int serial;
	String color;
	public Sonata(int s, String c) {
		serial = s;
		color = c;
	}
	public String toString() {
		return this.serial+","+color;
	}
}