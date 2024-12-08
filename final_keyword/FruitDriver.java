package final_keyword;

public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1=new Fruit("mango");
		f1.price=80;
		f1.displayFruit();
		f1.weight=3.5;
		f1.displayFruit();
		Fruit f2=new Fruit("grapes",90);
		f2.displayFruit();
	}

}
