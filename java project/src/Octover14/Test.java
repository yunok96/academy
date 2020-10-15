package Octover14;

class Ticket {
	int number;
	public Ticket(int num) {
		this.number=num;
	}
	
	@Override
	public boolean equals(Object obj) {
		Ticket tmp = (Ticket)obj;
		if(this.number==tmp.number)
			return true;
		else
			return false;
	}
	public static boolean equals(Ticket obj) {
			return true;
	}
}

class Test{
	public static void main(String[] args) {
		int a = 1;
		Integer aa = 1;
		Ticket ticket1 = new Ticket(11);
		Ticket ticket2 = new Ticket(22);
		Ticket ticket3 = new Ticket(11);
		Ticket ticket4 = ticket1;
		System.out.println(ticket1);
		System.out.println(ticket4.hashCode());
	}
}