class FruitDriver
{
	public static void main(String[] args){
		Fruit f1=new Fruit();
		Fruit f2=new Fruit();
		Fruit f3=new Fruit();

		f1.setValue("Mango", 110, 3.5);
		f2.setValue("Apple", 180, 5.5);
		f3.setValue("Orange", 70, 2.3);
		
		f1.getDetails();
		f2.getDetails();
		f3.getDetails();
	}
}







