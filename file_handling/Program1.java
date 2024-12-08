package file_handling;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("java program");
		System.out.println(12+3*5);
		try {
			System.out.println(12+15/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Infinity");
		}
		System.out.println(20+45*5);
		System.out.println("Program ends!!");
	}

}
