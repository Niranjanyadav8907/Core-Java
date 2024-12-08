class Vehicle
{
	int x=72;
	public void drive(){
		System.out.println("This is drive method");
		int x=100;
		System.out.println("Local x is: "+x);
		System.out.println("non-static x is: "+this.x);
	}	
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle();
		v1.drive();
	}
}







