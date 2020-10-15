package MeMeMe;

public class Human {
	String myname;
	boolean isMan;
	int WhereTo;
	public Human(String name,boolean gender, int whereTo) {
		this.myname=name;
		this.isMan=gender;
		this.WhereTo=whereTo;
	}
	String HeorShe(boolean isMan) {
		if(isMan)
			return "He";
		else
			return "She";
	}
	void Sentence(Elevator el, Floor fl) {
		System.out.println(this.myname+" is at "+fl.currentFloor+" Floor. "+this.HeorShe(this.isMan)+" wait Elevator, which moves at "+el.velocity+" m/s and in "+el.whereIsNow+", to get "+this.WhereTo+" Floor");
	}
}
