package collection_framework;
import java.util.ArrayList;
import java.util.List;
public class Program23 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(23);
		l1.add(45);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		System.out.println(l1.indexOf(55));
		System.out.println(l1.indexOf(45));
		System.out.println(l1.indexOf(100));
		
	}
}
