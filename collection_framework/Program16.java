package collection_framework;
import java.util.ArrayList;
import java.util.Collection;
public class Program16 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);c1.add(18);c1.add(20);
		Collection c2=new ArrayList();
		c2.add(12);	c2.add(18);	c2.add(20);
		System.out.println(c1.equals(c2));
		System.out.println(c1.isEmpty());
		Object[] x=c1.toArray();
		System.out.println(c1.hashCode());
	}

}
