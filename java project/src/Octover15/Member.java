package Octover15;

public class Member implements MyMy {
	public String name;
	public int age;
	public String job;
	public int address;
	public Member() {};//디폴트 생성자를 막아라
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setAddress(int address) {
		this.address=address;
	}
	public void my() {
		System.out.println("f");
	}
	@Override
	public String toString() {
		return "투스트링은 이제 없단다?";
	}
}
