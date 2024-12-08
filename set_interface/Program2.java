package set_interface;

import java.util.HashSet;
import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		Set hs=new LinkedHashSet();
		hs.add(346);
		hs.add(456);
		hs.add(456);
		hs.add(null);
		hs.add("abc");
		hs.add(34.6);
		hs.add(4576);
		hs.add(346);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		System.out.println(hs);
	}

}
