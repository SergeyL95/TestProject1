package January19;

public class DogDemo {
	
public static void main(String[] args) {
	
	GermanShepard d1 = new GermanShepard("Max", 2, "Large");
	GermanShepard d2 = new GermanShepard("Lucky", 1, "Medium");
	GermanShepard d3 = new GermanShepard("Jack", 5, "Large");
	
	d1.printDogInfo();
	d2.printDogInfo();
	d3.printDogInfo();
	
	GermanShepard.bark();
	GermanShepard.eat();
}
}
