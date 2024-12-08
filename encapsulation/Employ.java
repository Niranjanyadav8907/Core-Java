package encapsulation;
import java.io.Serializable;
import java.util.Scanner;
public class Employ implements Serializable{
	private int s_pin=2231;
	private String name;
	private int id;
	private double salary;
	Employ(){
		
	}
	public String getName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		int u_pin=sc.nextInt();
		if(s_pin==u_pin) {
			System.out.println("Validation is Successfull!");
			return name;
		}
		else
			System.out.println("INVALID PIN!!");
	return null;
	}
	public int getId() {
		//validation
	return id;
	}
	public double getSalary() {
		//validation
	return salary;
	}
	public void setName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		int u_pin=sc.nextInt();
		if(s_pin==u_pin) {
			System.out.println("Validation is Successfull! Name is Set");
			this.name=name;
		}
		else
			System.out.println("INVALID PIN!!Name is NOT Set!");
	
	}
	public void setId(int id) {
		//validation
	this.id=id;
	}
	public void setSalary(double salary) {
		//validation
	this.salary=salary;
	}
	
	

}
