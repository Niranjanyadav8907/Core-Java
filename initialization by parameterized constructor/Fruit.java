class Fruit
{
	String name;
	int price;
	double weight;
	Fruit()
	{
	}
	Fruit(String name){
		this.name=name;
	}
	Fruit(String name, int price){
		this.name=name;
		this.price=price;
	}
	Fruit(String name, int price, double weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	public void getDetails(){
		System.out.println("Name is: "+this.name);
		System.out.println("Price is: "+price);
		System.out.println("Weight is: "+weight);
		System.out.println("=================");
	}
}







