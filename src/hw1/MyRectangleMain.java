package hw1;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width = 10.0;
		double depth = 20.0;
		
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(width);
		r1.setDepth(depth);
		
		System.out.println(r1.getArea());
		
		MyRectangle r2 = new MyRectangle(10.0 , 20.0);
		System.out.println(r2.getArea());

	}

}
