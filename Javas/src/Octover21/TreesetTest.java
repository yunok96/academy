package Octover21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {

}

class Box2{
	private TreeSet<Nasi> tree;
	public Box2() {
		tree = new TreeSet<Nasi>();//해쉬셋 생성
	}
	public void addAp(Nasi ap) {//ap를 해쉬셋 add로 받음
		tree.add(ap);
	}
	public boolean removeAp(int serialNum) {//지우기
		Iterator<Nasi> ir = tree.iterator();//이터레이터 사용
		while(ir.hasNext()) {//끝까지 돌아서 다음 번호가 없으면 삭제하고 true 반환
			Nasi nasi = ir.next();//시리얼 넘버가 같으면 삭제
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
	public int hashCode() {//시리얼넘버를 해쉬코드로 지정
		return serialNum;
	}
	public boolean equals(Object obj) {//이퀄스 재정의. 해쉬코드가 같다면 true 반환
		if(this.hashCode()==((Nasi)obj).hashCode()) {
			return true;
		}
		else {
			return false;			
		}
	}
}