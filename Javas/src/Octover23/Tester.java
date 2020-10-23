package Octover23;

public class Tester {
	
	String id;
	public String getId() {
		return id;
	}
	void setid(String id) throws Err {
		if(id==null) {
			throw new Err("아이디가 없다");
		}
		this.id=id;
	}
	
	public static void main(String[] a) {
		Tester te = new Tester();
		String id=null;
		try {
			te.setid(id);
		} catch(Err e){
			System.out.println(e.getMessage());
		}
	}
}

class Err extends Exception{
	String ma;
	Err(String ma){
		super(ma);
	}
}