package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program27 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		Object o;
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		ListIterator lit=l1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("====================");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}





