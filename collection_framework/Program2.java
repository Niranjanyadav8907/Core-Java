package collection_framework;
import java.util.*;
import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		int x=34;
		c.add(x);
		c.add(new Car());
		Car c4=new Car();
		c.add(c4);
		c.add(34);
		c.add(45);
		c.add(66);
		c.add(45.77);
		c.add(44.66);
		c.add("jack");
		System.out.println(c);
		System.out.println("===============");
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}






