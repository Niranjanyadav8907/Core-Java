package car_management_project;

public class Car {
	String brand;
	int year;
	double price;
	String type;
	String model_name;
	Car(){
		
	}
	Car(String brand, int year, double price, String type, String model_name){
		this.brand=brand;
		this.year=year;
		this.price=price;
		this.type=type;
		this.model_name=model_name;
	}
	public String toString() {
		return "Brand: "+brand+" Year: "+year+" Price: "+price+" Type: "+type+" Model Name: "+model_name;
	}

}







