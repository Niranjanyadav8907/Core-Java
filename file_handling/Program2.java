package file_handling;
import java.io.*;
public class Program2 {
	public static void main(String[] args) {
		File f1=new File("f:\\abc.txt");
		try {
			f1.createNewFile();
			System.out.println("File Is Created");
		}
		catch(Exception e) {
			System.out.println("File is Not Created");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends!!");
	}

}
