package inheritance_loading;

public class Car extends Vehicle{
	{
		System.out.println("Car Non-static block");
	}
	Car(){
		System.out.println("Car constructor");
	}
	static
	{
		System.out.println("Car static block");
	}

}
