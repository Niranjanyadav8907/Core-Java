package tyre;

public class CEAT {
	public static int a=12;
	protected static int b=24;
	static int c=36;
	private static int d=48;
	public static void test() {
		System.out.println("public type test method of CEAT");
	}
	protected static void demo() {
		System.out.println("protected type demo method of CEAT");
	}
	static void start() {
		System.out.println("default type start method of CEAT");
	}
	private static void drive() {
		System.out.println("private type drive method of CEAT");
	}
	public static void main(String[] args) {
		
		System.out.println("This is CEAT class");
		System.out.println("a is: "+a);
		test();
		System.out.println("b is: "+b);
		demo();
		System.out.println("c is: "+c);
		start();
		System.out.println("d is: "+d);
		CEAT.drive();
	}

}




