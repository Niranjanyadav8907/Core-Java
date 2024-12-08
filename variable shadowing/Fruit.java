class Fruit
{
	static int x=30;
	public static void test(){
		System.out.println("This is Test method");
		int x=57;
		System.out.println("Local x is: "+x);
		System.out.println("static x is: "+Fruit.x);
	}	
	public static void main(String[] args)
	{
		test();	
	}
}







