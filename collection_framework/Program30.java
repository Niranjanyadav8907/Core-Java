package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program30 {
public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(24);
	l1.add(46);
	l1.add(47);
	l1.add(56);
	l1.add(41);
	l1.add(78);
	l1.add(43);
	System.out.println("original l1: "+l1);
	ListIterator lit=l1.listIterator(l1.size());
	while(lit.hasPrevious()) {
		if(((int)lit.previous())%2==1)
			lit.remove();
	}
	System.out.println("updated l1: "+l1);
}


}
