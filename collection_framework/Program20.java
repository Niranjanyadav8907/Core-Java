package collection_framework;
import java.util.ArrayList;
import java.util.List;
public class Program20 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(23);
		l1.add(45);
		l1.add(1, 47);
		l1.add(1, 50);
		List l2=new ArrayList();
		l2.add(34);
		l2.add(0,45);
		l2.add(1,66);
		
		l1.addAll(2,l2);
		System.out.println("l1 is: "+l1);
	}

}
