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
		hash = new HashSet<Apple>();//해쉬셋 생성
	}
	public void addAp(Apple ap) {//ap를 해쉬셋 add로 받음
		hash.add(ap);
	}
	public boolean removeAp(int serialNum) {//지우기
		Iterator<Apple> ir = hash.iterator();//이터레이터 사용
		while(ir.hasNext()) {//끝까지 돌아서 다음 번호가 없으면 삭제하고 true 반환
			Apple apple = ir.next();//시리얼 넘버가 같으면 삭제
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
	public int hashCode() {//시리얼넘버를 해쉬코드로 지정
		return serialNum;
	}
	public boolean equals(Object obj) {//이퀄스 재정의. 해쉬코드가 같다면 true 반환
		if(this.hashCode()==((Apple)obj).hashCode()) {
			return true;
		}
		else {
			return false;			
		}
	}
}