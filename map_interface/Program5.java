package map_interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program5 {
	public static void main(String[] args) {
		Map<Integer, String> m1=new HashMap<>();
		m1.put(12, "cde");
		m1.put(22, "xyz");
		m1.put(16, "pqr");
		m1.put(18, "abc");
		m1.put(23, "ijk");
		m1.put(20, "def");
		m1.put(19, "cde");
		System.out.println(m1);
		Collection<String> c1=m1.values();
		System.out.println("All Values: "+c1);
		for(String x:c1)
			System.out.println(x);
	}

}
