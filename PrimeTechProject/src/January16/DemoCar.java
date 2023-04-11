package January16;

public class DemoCar {
	public static void main(String[] args) {
		
	
	Car car1 = new Car();
	
	car1.make = "Chevrolet";
	car1.model = "Silverado";
	car1.color = "Gray";
	
	Car car2 = new Car();
	
	car2.make = "Mercedes";
	car2.model = "G class";
	car2.color = "Black";
	
	Car car3 = new Car();
	
	car3.make = "Land Rover";
	car3.model = "Range Rover";
	car3.color = "White";
	
	System.out.println("First car data\nMake: " + car1.make + "\nModel: " + car1.model + "\nColor: " + car1.color);
	
	System.out.println("-----");
	
	System.out.println("Second car data\nMake: " + car2.make + "\nModel: " + car2.model + "\nColor: " + car2.color);
	
	System.out.println("-----");
	
	System.out.println("Third car data\nMake: " + car3.make + "\nModel: " + car3.model + "\nColor: " + car3.color);
}
	
}

