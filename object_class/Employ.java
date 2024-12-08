package object_class;

public class Employ {
	String name;
	int id;
	double salary;
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	Employ(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public String toString() {
	return "Name is: "+name+" ID is: "+id+" Salary is: "+salary;
	}
	@Override
	public int hashCode() {
	return id;
	}
	public boolean equals(Object o) {
		Employ e=(Employ)o;
	return this.id==e.id && this.name.equals(e.name) && this.salary==e.salary;
	}
	@Override
	public void finalize() {
		System.out.println("Detach system connection");
		System.out.println("Detach database connection");
		System.out.println("Detach network connection");
		System.out.println("===========================");
	}

}







