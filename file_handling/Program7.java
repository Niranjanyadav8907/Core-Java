package file_handling;
import java.util.Scanner;
import java.io.*;
public class Program7 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String str=sc.nextLine();
		FileWriter fw=null;
		try {
			fw=new FileWriter("f:\\test.txt");
			System.out.println("File is created");
			fw.write(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("program Ends!!");
	}

}
