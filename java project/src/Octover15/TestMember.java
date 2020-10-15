package Octover15;

import java.lang.reflect.*;

public class TestMember {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Member mem = new Member("김민수", 25);
		mem.setAddress(152761);
		mem.setJob("백수의 왕");
		
		Class member3 = Class.forName("Octover15.Member");//클래스.forName으로 불러오기(예외처리 필요?)
		
		System.out.println("메서드");
		Method[] methods = member3.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("필드");
		Field[] fi = member3.getFields();
		for (Field field : fi) {
			System.out.println(field);
		}
		System.out.println("생성자");
		Constructor[] cons = member3.getConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		System.out.println("상속");
		
		System.out.println(member3.getSuperclass());
		System.out.println(member3.getInterfaces());
		
		Member mem1 = (Member)member3.newInstance();//뉴인스턴스를 통한 생성
		System.out.println(mem1.toString());
		//[Ljava.lang.Class;@136432db
		
	}

}
