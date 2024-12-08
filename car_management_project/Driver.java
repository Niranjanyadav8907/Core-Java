package car_management_project;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		CarManager cm=new CarManager();
		Car c1=new Car("TATA", 2020, 464666.56, "Petrol", "safari");
		cm.l.add(c1);
		cm.l.add(new Car("Maruti", 2021, 400666.56, "Petrol", "maruti800"));
		cm.l.add(new Car("kia", 2021, 122666.56, "Petrol", "seltos"));
		cm.l.add(new Car("honda", 2021, 1400666.56, "diesel", "city"));
		cm.l.add(new Car("TATA", 2021, 455666.56, "Petrol", "nexon"));
		cm.l.add(new Car("TATA", 2021, 134666.56, "diesel", "nexon"));
		cm.l.add(new Car("Maruti", 2021, 800666.56, "cng", "swift"));
		
		cm.selectOption();
		
	}

}




