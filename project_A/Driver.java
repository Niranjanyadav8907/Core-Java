package project_A;

public class Driver {
	public static void main(String[] args) {
		Shape s1=new Rectangle();
		Shape s2=new Circle();
		Shape s3=new Square();
		Shape s4=new Triangle();
		
		s1.getArea();
		s1.getPerimeter();
		System.out.println("=================");
		s2.getArea();
		s2.getPerimeter();
		System.out.println("==================");
		s3.getArea();
		s3.getPerimeter();
		System.out.println("===================");
		s4.getArea();
		s4.getPerimeter();
	}

}
