package Feb2Abstraction;

public abstract class Animal {
	
	String name;
	int age;
	static String bloodLine;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void makeSound();
	
	void eat() {
		System.out.println("Animal is eating");
	}
	
	void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
