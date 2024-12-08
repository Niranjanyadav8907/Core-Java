package map_interface;

public class Car {
	String brand;
	double price;
	int carno;
	
	Car(){
		
	}
	Car(String brand, double price, int carno){
		this.brand=brand;
		this.price=price;
		this.carno=carno;
	}
	public String toString() {
	return brand+" "+price+" "+carno;	
	}

}
