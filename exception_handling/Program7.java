package exception_handling;

public class Program7 {
	public static void main(String[] args) {
		test();
		
	}
	public static void test() {
		System.out.println("This is test method");
		test();
	}

}
