package Feb2Abstraction;

public class Bike implements Vehicle{

	int gear;
	int speed;
	
	@Override
	public void changeGear(int newGear) {
		this.gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: " + this.speed + "\nGear: " + this.gear);
	}

}
