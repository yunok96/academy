package MeMeMe;

public class Na {
	private String name="김민수";
	
	public void on(Remote remote, TV tv) {
		System.out.println(this.name+"는 "+remote.name+"으로 "+tv.name+"를 켰다");
	}
}
