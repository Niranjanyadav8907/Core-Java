package project_A;

public interface Shape {
	public void getArea();
	
	default void getPerimeter() {
		System.out.println("default perimeter body");
		perimeter();
	}
	
	private void perimeter() {
		System.out.println("Perimetr of a shape is total boundry length");
	}
	
	
	

}
