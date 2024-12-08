package method_overriding;

public class User {
	public static void main(String[] args) {
		Game g=new Game();
		Shape s=g.selectShape();
		s.area();
		
	}

}
