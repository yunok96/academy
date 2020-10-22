package Octover16;

public class GernericMethods {
	
	static <X extends Number,Y extends Number>double NN(Point<X,Y> p1, Point<X,Y> p2){
		double left=((Number)p1.getPointX()).doubleValue();
		double top=((Number)p1.getPointX()).doubleValue();
		double right=((Number)p2.getPointY()).doubleValue();
		double down=((Number)p2.getPointY()).doubleValue();
		
		double horizon = Math.abs(right - left);
		double vertical = Math.abs(top - down);
		
		return horizon*vertical;
	}

	public static void main(String[] args) {
		
		Point<Double,Double> point1 = new Point<Double,Double>(0.0, 0.0);
		Point<Double,Double> point2 = new Point<Double,Double>(10.0, 10.0);
		System.out.println(NN(point1,point2));
	}

}

class Point<X,Y> {
	private X x;
	private Y y;
	Point(X x,Y y){
		this.x=x;
		this.y=y;
	}
	public X getPointX() {
		return this.x;
	}
	public Y getPointY() {
		return this.y;
	}
}