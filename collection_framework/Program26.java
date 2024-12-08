package collection_framework;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
public class Program26 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		ListIterator lit=l1.listIterator();
		System.out.println(lit.next());//23
		System.out.println(lit.previous());//23
		System.out.println("======================");
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		System.out.println(lit.next());
		
		
	}
}
