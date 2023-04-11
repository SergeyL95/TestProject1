package January19;

public class GermanShepard {
	
	static String breed = "German shepard";
	static String color = "Sable";
	
	String name;
	int age;
	String size;
	
	
	public GermanShepard(String name, int age, String size) {
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public void printDogInfo() {
		System.out.println("Dog's name: " + this.name);
		System.out.println("Dog's age: " + this.age);
		System.out.println("Dog's size: " + this.size);
		System.out.println("Dog's breed: " + breed);
		System.out.println("Dog's color: " + color);
		System.out.println("***********************");
	}
	
	public static void bark() {
		System.out.println("WOOF");
	}
	
	public static void eat() {
		System.out.println("Dog is eating");
	}
	
}
