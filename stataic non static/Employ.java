class Employ
{
	static String comp_name="Alphabet Inc.";
	String emp_name;
	int eid;
	public static void giveBiometric(){
		System.out.println("Employ Should give Biometric");
	}
	public void work(){
		System.out.println("Employ is working");
	}	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");				System.out.println("Company Name is: "+comp_name);
		giveBiometric();
		System.out.println("======================");
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();

		e2.comp_name="ATOZ COMPANY";
		e2.emp_name="Mohan Sigh";
		


		System.out.println("=========EMploy1 details=====");
		System.out.println("Object address is: "+e1);
		System.out.println("Employ company Name is: "+e1.comp_name);
		System.out.println("Employ Name is: "+e1.emp_name);
		System.out.println("Employ ID is: "+e1.eid);
		e1.giveBiometric();
		e1.work();
		System.out.println("=========EMploy2 details=====");
		System.out.println("Object address is: "+e2);
		System.out.println("Employ company Name is: "+e2.comp_name);
		System.out.println("Employ Name is: "+e2.emp_name);
		System.out.println("Employ ID is: "+e2.eid);
		e2.giveBiometric();
		e2.work();
		System.out.println("=========EMploy3 details=====");
		System.out.println("Object address is: "+e3);
		System.out.println("Employ company Name is: "+e3.comp_name);
		System.out.println("Employ Name is: "+e3.emp_name);
		System.out.println("Employ ID is: "+e3.eid);
		e3.giveBiometric();
		e3.work();
	}
}







