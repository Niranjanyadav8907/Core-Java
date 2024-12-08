package set_interface;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(23);
		l1.add(25);
		l1.add(30);
		l1.add(23);
		l1.add(25);
		l1.add(23);
		l1.add(30);
		System.out.println(l1);
		Set<Integer> s1=new TreeSet<>(l1);
		System.out.println(s1);
	}

}
