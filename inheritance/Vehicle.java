package inheritance;
public class Vehicle {
	String name;
	String color;
	int price;
	Vehicle(){
		
	}
	Vehicle(String name, String color, int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void getVehicledetails() {
		System.out.println("Name is: "+name);
		System.out.println("Color is: "+color);
		System.out.println("Price is: "+price);
	}

}
