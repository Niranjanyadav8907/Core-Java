package map_interface;

import java.util.HashMap;
import java.util.*;

public class Program12 {
	public static void main(String[] args) {
		Map<String, Integer> hm=new IdentityHashMap<>();
		hm.put("abc", 34);//entry with key "abc"
		String s1="abc";
		hm.put(s1, 100);//entry with key "abc" so new entry
		//will not be added
		String s2=new String("abc");
		hm.put(s2, 200);//entry with key "abc" so new entry
		//will not be added
		System.out.println(hm);//{["abc", 100], ["abc", 200]}
	}

}
