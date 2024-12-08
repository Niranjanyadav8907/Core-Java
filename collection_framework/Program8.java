package collection_framework;
import java.util.ArrayList;
import java.util.Collection;
public class Program8 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(22);
		c1.add(34);
		c1.add(44);
		c1.add(55);
		c1.add(43);
		System.out.println(c1.remove(34));
		System.out.println(c1.remove(100));
		System.out.println("c1 is: "+c1);
		
	}

}
