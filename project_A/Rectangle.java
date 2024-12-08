package project_A;

public class Rectangle implements Shape{
	
	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is length*width");
	}
	
	
	@Override
	public void getPerimeter() {
		System.out.println("perimeter of rectangle is: 2*(length+width)");
	}
	

}
