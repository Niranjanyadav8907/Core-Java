package collection_framework;
import java.util.ArrayList;
import java.util.List;
public class Program35 {
		public static void main(String[] args) {
			List<Integer> l1=new ArrayList<>();
			l1.add(23);l1.add(56);l1.add(45);l1.add(66);
			l1.add(56);l1.add(23);l1.add(56);l1.add(100);
			l1.add(45);
			System.out.println("All elemets: "+l1);
			System.out.println("Unique elements: "+getUnique(l1));
	}
	public static List<Integer> getUnique(List<Integer> l)
	{
		List<Integer> a=new ArrayList<>();
		for(int x: l) {
			if(!a.contains(x))
				a.add(x);
		}
	return a;
	}
}






