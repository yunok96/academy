package MeMeMe;
import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		/*ClassArr[] cl = new ClassArr[5];
		cl[0] = new ClassArr("김가","나나");
		cl[0].Show();
		System.out.println(cl[0]);
		System.out.println(cl[1]);
		int[] ta = {0,1,2};
		int[] te = {3,4,5};
		System.arraycopy(ta, 0, te, 1, 1);
		System.out.println(te[0]);*/
		Apple[] ap = new Apple[3];
		Apple[] ap2 = new Apple[3];
		for (int i = 0; i < ap.length-1; i++) {
			ap[i]=new Apple();
		}
		int[] test = new int[10];
		for(int i=0;i<test.length;i++) {
			test[i]=i;
		}
		/*for(int a : test) {
			System.out.println(a);
		}*/
		ArrayList<Apple> li = new ArrayList<Apple>();
		li.add(new Apple());
		li.add(new Apple());
		li.add(new Apple());
		//System.out.println(li.size());
		ArrayList nn = new ArrayList();
		nn.add(1);
		nn.add("가나다");
		nn.add("3번");
		nn.add("4번");
		//System.out.println(nn.size());
		nn.remove(2);
		for(int i =0;i<nn.size();i++) {
			System.out.println(nn.get(i));			
		}
		
		
	}

}
