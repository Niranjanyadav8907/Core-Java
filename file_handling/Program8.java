package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Name: ");
		String name=sc.nextLine();
		System.out.println("ENter the Age: ");
		int age=sc.nextInt();
		System.out.println("ENter the Weight: ");
		String weight=sc.next();
		FileWriter fw=null;
		try {
			fw=new FileWriter("f:\\userdetails.txt");
			System.out.println("File is created");
			fw.write("name is: "+name+"\n");
			fw.write("Age is: "+age+" Years");
			fw.write("\nWeight is: "+weight+" Kg");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("program Ends!!");
	}

}
