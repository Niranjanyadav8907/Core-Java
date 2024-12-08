package inheritance_loading;

public class Vehicle {
	int x=30;

	Vehicle(){
		System.out.println("Vehicle constructor");
	}
	{
		System.out.println("Vehicle Non-static block");
	}
	
	static
	{
		System.out.println("Vehicle static block");
	}

}
