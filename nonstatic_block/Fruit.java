package nonstatic_block;

public class Fruit {
	
	{
		System.out.println("This is Non-static block");
		Fruit f1=new Fruit();
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		Fruit f1=new Fruit();
	}

}
