package collection_framework;
import java.util.ArrayList;
import java.util.Collection;
public class Program17 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);c1.add(18);c1.add(20);
		c1.add("abc");c1.add(44.67);
		Object[] x=c1.toArray();
		for(int i=0;i<c1.size();i++) {
			System.out.println(x[i]);
		}
		System.out.println("Program ends!");
	}

}
