package set_interface;
import java.util.Set;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Set hs=new HashSet();
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
