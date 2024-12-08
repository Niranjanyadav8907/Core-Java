package final_keyword;

public class Fruit {
	final String name;
	int price;
	double weight;
	Fruit(int price, String name, double weight){
		this.price=price;
		this.name=name;
		this.weight=weight;
	}
	Fruit(String name){
		this.name=name;
	}
	Fruit(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void displayFruit() {
		System.out.println("name is: "+name);
		System.out.println("price is: "+price);
		System.out.println("weight is: "+weight);
		System.out.println("====================");
	}

}
