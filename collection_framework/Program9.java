package collection_framework;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);c1.add(18);c1.add(20);
		c1.add(12);c1.add(16);c1.add(12);
		c1.add(20);	c1.add(18);	c1.add(15);
		Collection c2=new ArrayList();
		c2.add(17);
		c2.add(18);	c2.add(12);	c2.add(25);
		c1.removeAll(c2);
		System.out.println("c1 is: "+c1);
	}

}




