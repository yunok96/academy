package object;

class Student{
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString(){
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student std = (Student)obj;
			if( studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2 주소가 같다.");
		else
			System.out.println("studentLee와 studentLee2 주소가 다르다.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2 동일하다.");
		else
			System.out.println("studentLee와 studentLee2 다르다.");
		
		//�ּҴ� �ٸ����� equals �� ����� true �� ���
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang 주소가 같다.");
		else
			System.out.println("studentLee와 studentSang 주소가 다르다.");
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang 동일하다.");
		else
			System.out.println("studentLee와 studentSang 다르다.");

		System.out.println("studentLee�� hashCode :" +studentLee.hashCode());
		System.out.println("studentSang�� hashCode :" +studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּҰ� :"+ System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּҰ� :"+ System.identityHashCode(studentSang));
	
	}
}
