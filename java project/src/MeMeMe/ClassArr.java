package MeMeMe;

public class ClassArr {
	private String bookName;
	private String personName;
	public ClassArr() {};
	public ClassArr(String name,String pName) {
		this.bookName=name;
		this.personName=pName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void Show() {
		System.out.println(bookName+", "+personName);
	}
}
