package non_primitive_casting;
public class User {
	public static void main(String[] args) {
		Game g=new Game();
		Vehicle v1=g.selectVehicle();//new Car(), new Bus(), new Bike()
		System.out.println("a is: "+v1.a);
		System.out.println("b is: "+v1.b);
		
		if(v1 instanceof Car)
		{
			System.out.println("This is Car Object");
			Car car=(Car)v1;
			System.out.println("c is: "+car.c);
			System.out.println("d is: "+car.d);
		}
		else if(v1 instanceof Bike)
		{
			System.out.println("This is Bike Object");
			Bike bike=(Bike)v1;
			System.out.println("e is: "+bike.e);
			System.out.println("f is: "+bike.f);
		}
		else if(v1 instanceof Bus)
		{
			System.out.println("This is Bus Object");
			Bus bus=(Bus)v1;
			System.out.println("g is: "+bus.g);
			System.out.println("h is: "+bus.h);
		}
	
	}

}
