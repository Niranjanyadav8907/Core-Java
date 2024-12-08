class Fruit
{
	
	String name;
	int price;
	double weight;
	String color;
	Fruit(String name){
		this();
		this.name=name;
	}
	Fruit(String name, int price){
		this(name);
		this.price=price;
	}
	Fruit(String name, int price, double weight){
		this(name, price);
		this.weight=weight;
	}
	Fruit(String name, int price, double weight, String color){
		this(name, price, weight);
		this.color=color;
	}

	public void getDetails(){
		System.out.println("Name is: "+this.name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
		System.out.println("Color is: "+color);
		System.out.println("=================");
	}
}







