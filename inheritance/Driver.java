package inheritance;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car("TATA", "White", 325346, 120, 6);
		Car c2=new Car("Maruti", "Black", 425346, 140, 6);
		Car c3=new Car("Audi", "Red", 5325346, 180, 8);
		Vehicle v1=new Vehicle("Cycle", "Green", 23435);
		c1.getCarDetails();
		c2.getCarDetails();
		c3.getCarDetails();
		v1.getVehicledetails();
	}

}
