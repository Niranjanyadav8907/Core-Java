package project_A;

public class Circle implements Shape{
	
	@Override
	public void getArea() {
		System.out.println("Area of Circle is PI*r*r");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is 2*PI*r");
	}

}
