package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program33 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(24);
		l1.add(46);
		l1.add(47);
		l1.add(56);
		l1.add(40);
		l1.add(77);
		l1.add(48);
		System.out.println(l1.get(0)+100);
		
		System.out.println("original l1: "+l1);
		ListIterator<Integer> lit=l1.listIterator(l1.size());
		while(lit.hasPrevious()) {
			int p=lit.previous();
			if(p%2==1)
				lit.add(100);
		}
		System.out.println("updated l1: "+l1);
}

}
