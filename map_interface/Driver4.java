package map_interface;

import java.util.Map;
import java.util.TreeMap;

public class Driver4 {
	public static void main(String[] args) {
		Car c1=new Car("TATA", 346456.5, 345);
		Car c2=new Car("Audi", 336456.5, 340);
		Car c3=new Car("Maruti", 446456.5, 245);
		Car c4=new Car("KIA", 146456.5, 145);
		Map<Car, Integer> m1=new TreeMap<>();
		m1.put(c1,1);
		m1.put(c2,2);
		m1.put(c3,3);
		m1.put(c4,4);
		for(Map.Entry<Car, Integer> x:m1.entrySet())
		System.out.println(x.getKey()+"==>"+x.getValue());
	}
	

}
