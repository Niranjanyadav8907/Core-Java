package method_overriding;

public class Driver {
	public static void main(String[] args) {
		Shape s1=new Circle();
		s1.area();
		Shape s2=new Rectangle();
		s2.area();
		Shape s3=new Square();
		s3.area();
	}

}
