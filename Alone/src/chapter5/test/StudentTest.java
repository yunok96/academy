package chapter5.test;

import chapter5.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "���� ��õ��";  //address�� ���� �����ڸ� public���� �����ϸ� ���� ������
		//studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}
}

