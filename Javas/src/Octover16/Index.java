package Octover16;

public class Index {

	public static void main(String[] args) {
		
		
		System.out.println("HelloWorld");

	}

}
class Generik<T>{
	private T mat;
	public void setMat(T mat) {
		this.mat=mat;
	}
	public T getMat() {
		return this.mat;
	}
}