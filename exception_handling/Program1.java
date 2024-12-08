package exception_handling;
public class Program1 {
	public static void main(String[] args) {
		System.out.println("Program1 starts");
		System.out.println(12+40*5);
		try {
			System.out.println(34+40/0);
		}
		catch(Exception e) {
			System.out.println("Infinity");
		}
		System.out.println(50+55*8);
		System.out.println("Program ends");
	}

}
