package collection_framework;
import java.util.*;
public class Program37 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(34);
		l1.add(45);
		l1.add(58);
		System.out.println(l1);
		List<Integer> l2=new ArrayList<>(l1);
		System.out.println(l2);
		
	}

}
