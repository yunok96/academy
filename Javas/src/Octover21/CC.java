package Octover21;

import java.util.ArrayList;

public class CC {
	public static void main(String[] a) {

		Emp emp1 = new Emp(1,"java");
		Emp emp2 = new Emp(2,"DB");
		Emp emp3 = new Emp(3,"C#");
		Emp emp4 = new Emp(4,"Python");
		//List<Emp> li = new ArrayList<Emp>();
	}
}

class Emp implements Comparable<Emp>{
	private int id;
    private String name;
    
    public Emp(int a, String b) {
    	id=a;
    	name=b;
    }
    
    @Override
    public int compareTo(Emp o) {
        return this.name.compareTo(o.name);
        //return this.id - o.id;
        //return this.department.compareTo(o.department);
    }
}
