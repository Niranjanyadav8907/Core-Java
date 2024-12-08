package file_handling;

import java.io.*;
import java.io.IOException;

public class Program5 {
	public static void main(String[] args)throws Exception {
		File f1=new File("f:\\abc.txt");
		FileWriter fw=null;
		try {
			f1.createNewFile();
			fw=new FileWriter(f1);
			System.out.println("File is cretaed!");
			char[] x= {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
			fw.write(x);
			fw.write(x, 2, 3);
			fw.write("\n");
			fw.write("Mohan is here", 3, 4);
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
