package abstract_class;

public abstract class Vehicle {
	static int x=12;
	int y;
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("NOn static block");
	}
	
		public abstract void start();
		public abstract void stop();
		
		public void drive() {
			System.out.println("Drive vehicle");
		}
		public void accelerate() {
			System.out.println("Accelerate vehicle");
		}
	

}
