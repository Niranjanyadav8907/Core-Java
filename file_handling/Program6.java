package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
	public static void main(String[] args)throws Exception {
		File f1=new File("f:\\abc.txt");
		FileWriter fw=null;
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			
			fw.write("3tergreteete");
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
