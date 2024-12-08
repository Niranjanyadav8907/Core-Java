package map_interface;
import java.util.*;
public class Program11 {
	public static void main(String[] args) {
		Map<String, Integer> m=new TreeMap<>();
		m.put("abc", 34);
		m.put("ijk", 222);
		m.put("cde", 55);
		m.put("pqr", null);
		m.put("efg", 100);
		m.put("xyz", 333);
		System.out.println(m);
	}

}
