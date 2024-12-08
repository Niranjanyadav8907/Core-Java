package non_primitive_casting;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main starts");
		Object o1=	new Bus();
		Vehicle v1=(Vehicle)o1;
		Bus c1=(Bus)v1;
		System.out.println("Main ends!!");
		
	}

}
