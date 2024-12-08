package collection_framework;
import java.util.*;
public class Program3 {
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
		System.out.println("All Elements: "+c1);
		System.out.println("All the Integer elements are Below");
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer)
				System.out.print(o+" ");
		}
		
		
	}

}




