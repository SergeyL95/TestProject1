package OOP;

public class Pet {
	
	String name;
	String color;
	
	public Pet(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void play() {
		System.out.println("Pet is playing");
	}
	
	public void speak() {
		System.out.println("Pet is speaking");
	}
	
	public void petInfo() {
		System.out.println("Pet name: " + name);
		System.out.println("Pet color: " + color);
	}
}
