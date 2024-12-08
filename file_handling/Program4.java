package file_handling;
import java.io.*;
public class Program4 {
	public static void main(String[] args) throws Exception{
		FileWriter fw=null;
		int x='@';
		System.out.println("x is: "+x);
		try {
			fw=new FileWriter("f:\\abc.txt");
			System.out.println("File is cretaed!");
			fw.write(97);
			fw.write('@');
			fw.write("\nmohan is here");
		} catch (IOException e) {
			System.out.println("File is not created!");
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("Program Ends!!");
		
		
	}

}
