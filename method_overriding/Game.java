package method_overriding;
import java.util.Scanner;
public class Game {
	public  Shape  selectShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>To select Circle");
		System.out.println("Press 2==>To select Rectangle");
		System.out.println("Press 3==>To select Square");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("You have selected Circle");
				return new Circle();
			case 2:
				System.out.println("You have selected Rectangle");
				return new Rectangle();
			case 3:
				System.out.println("You have selected Square");
				return new Square();
			default:
				System.out.println("Invalid Choice");
				return selectShape();
		}
	}

}
