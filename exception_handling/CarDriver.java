package exception_handling;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("TATA");
		System.out.println("Car Name is: "+c1.name);
		c1=null;
		System.out.println("Car Name is: "+c1.name);
		
	}

}
