package Feb2Abstraction;

public class VehicleDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.changeGear(1);
		bike.speedUp(20);
		bike.applyBrakes(5);
		bike.printStates();
		
		Vehicle v2 = new Bicycle();
		
		
	}
}
