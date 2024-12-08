package collection_framework;
import java.util.ArrayList;
import java.util.List;
public class Program24 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(23);
		l1.add(45);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		l1.set(1,100);
		System.out.println(l1);
	}

}
