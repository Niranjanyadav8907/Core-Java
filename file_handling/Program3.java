package file_handling;

import java.io.File;

public class Program3 {
	public static void main(String[] args) {
		File f1=new File("f:\\abc.txt");
		try {
			f1.createNewFile();
			System.out.println("File Is Created");
			System.out.println("FIle Size is: "+f1.length());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			f1.setWritable(false);
		}
		catch(Exception e) {
			System.out.println("File is Not Created");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends!!");
	}

}
