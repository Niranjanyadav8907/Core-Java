class Fruit
{
	static int x=12;
	int y=40;
	public static void test(){
		System.out.println("Static test method");
		System.out.println("x is: "+x);
		demo();
		Fruit f1=new Fruit();
		System.out.println("y is: "+f1.y);
		f1.drive();
	}
	public static void demo(){
		System.out.println("static demo method");
	}
	public void start(){
		System.out.println("Non Static start method");
		System.out.println("y is: "+y);
		drive();
		System.out.println("x is: "+x);
		demo();
	}
	public void drive(){
		System.out.println("Non static drive method");
	}	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		test();
		System.out.println("================");
		Fruit f1=new Fruit();
		f1.start();
	}
}







