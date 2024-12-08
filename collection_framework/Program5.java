package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program5 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add(34.5);
		c1.add(55);
		c1.add('@');
		c1.add("abc");
		c1.add(45.88);
		c1.add(56);
		c1.add(100);
		int sum=0;
		System.out.println("All Elements: "+c1);
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if((o instanceof Integer))
				sum=sum+(int)o;
		}
		System.out.println("Total integer sum is: "+sum);
	}

}
