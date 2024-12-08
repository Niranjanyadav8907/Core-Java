package static_block;

public class ElectricCar extends Car{
	static int x=30;
	
	static {
		System.out.println("ElectricCar static block");
	}

}
