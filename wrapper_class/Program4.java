package wrapper_class;

public class Program4 {
	public static void main(String[] args) {
		Integer x=345;//non-prirmitive data
		//int y=x;
		
		int y=x.intValue();//primitive data
		System.out.println(x.intValue()+100);
	}

}
