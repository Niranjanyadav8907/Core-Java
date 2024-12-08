class FruitDriver
{
	public static void main(String[] args){
		Fruit f1=new Fruit("Mango", 110, 3.5);
		Fruit f2=new Fruit();
		Fruit f3=new Fruit();
		Fruit f4=new Fruit("Apple");
		Fruit f5=new Fruit("Orange", 80);

		Fruit f6=new Fruit(f1);
		Fruit f7=new Fruit(f5);
		Fruit f8=new Fruit(f4);
		
		f1.getDetails();
		f2.getDetails();
		f3.getDetails();
		f4.getDetails();
		f5.getDetails();
		f6.getDetails();
		f7.getDetails();
		f8.getDetails();

	}
}







