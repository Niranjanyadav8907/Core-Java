package collection_framework;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.ListIterator;
public class Program28 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		ListIterator<Integer> lit=l1.listIterator(3);
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
