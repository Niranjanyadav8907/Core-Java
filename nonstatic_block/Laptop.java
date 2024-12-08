package nonstatic_block;
public class Laptop {
	{
		System.out.println("Non-static block-1");
	}
	static {
		System.out.println("This is static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("This is Main method");
		Laptop l1=new Laptop();
		System.out.println("===============");
		Laptop l2=new Laptop();
		System.out.println("===============");
		Laptop l3=new Laptop();
	}
	{
		System.out.println("Non-static block-2");
	}

}
