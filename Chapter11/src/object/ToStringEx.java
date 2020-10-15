package object;

class Book{
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	
	@Override
	public boolean equals(Object obj) {
		Book tmp = (Book)obj;
		if(this.bookNumber==tmp.bookNumber) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	Book book3 = book1;
	Book book2 = new Book(200,"개미");
	String ff = "ff";
	String dd = "ff";
	System.out.println(ff.equals(dd));
	System.out.println(book3.equals(book2));
	System.out.println(book1);
	}
}

