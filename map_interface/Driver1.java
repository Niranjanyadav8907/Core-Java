package map_interface;
import java.util.*;
public class Driver1 {
	public static void main(String[] args) {
		Car c1=new Car("TATA", 346456.5, 345);
		Car c2=new Car("Audi", 336456.5, 340);
		Car c3=new Car("Maruti", 446456.5, 245);
		Car c4=new Car("KIA", 146456.5, 145);
		Map<Integer, Car> m1=new HashMap<>();
		m1.put(1, c1);
		m1.put(2, c2);
		m1.put(3, c3);
		m1.put(4, c4);
		for(Map.Entry<Integer, Car> x:m1.entrySet())
		System.out.println(x.getKey()+"==>"+x.getValue());
	}

}
