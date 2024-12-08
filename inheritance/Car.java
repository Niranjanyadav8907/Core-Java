package inheritance;

public class Car extends Vehicle{
	int hp;
	int strokes;
	Car(){
		
	}
	Car(String name, String color, int price, int hp, int strokes){
		/*super.name=name;
		super.color=color;
		super.price=price;*/
		super(name, color, price);
		this.hp=hp;
		this.strokes=strokes;
	}
	public void getCarDetails() {
		super.getVehicledetails();
		System.out.println("HP is: "+hp);
		System.out.println("Strokes is: "+strokes);
		System.out.println("======================");
	}

}
