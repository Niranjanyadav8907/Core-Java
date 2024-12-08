package interface_part;

public class ElectricCar implements Car{
	@Override
	public void start() {
		System.out.println("Start the electric Car");
	}
	@Override
	public void stop() {
		System.out.println("Stop the electric Car");
	}
	@Override
	public void openGate() {
		System.out.println("open gate the electric Car");
	}

}
