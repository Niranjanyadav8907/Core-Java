package object_class;

public class EmployDriver {
	public static void main(String[] args) {
		System.out.println("Mohan".equals("Mohan"));
		Employ e1=new Employ("Mohan", 123, 46457.45);
		Employ e2=new Employ("Sohan", 126, 48457.45);
		Employ e3=new Employ("Mohan", 123, 46457.45);
		System.out.println("=======toString()========");
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e2);
		System.out.println(e2.toString());
		System.out.println(e3);
		System.out.println(e3.toString());
		System.out.println("===========hashCode()===========");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("==========equals()============");
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println("=========");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("===========finalize()=============");
		e1=null;
		System.gc();
	}

}






