package vehicle;

import tyre.CEAT;

public class Car extends CEAT{
	public static void main(String[] args) {
		System.out.println("This is Car class");
		System.out.println("a from CEAT is: "+CEAT.a);
		CEAT.test();
		System.out.println("b from CEAT is: "+CEAT.b);
		CEAT.demo();
	}

}
