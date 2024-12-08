package static_block;

public class Program1 {
	static
	{
		System.out.println("Static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method of Program1");
	}
	static
	{
		System.out.println("Static block-2");
	}
	static
	{
		System.out.println("Static block-3 ");
	}

}
