package Feb2Abstraction;

public class ShapeDemo {
	public static void main(String[] args) {
		Animal animal = new Cat("Simba", 1);
		
		animal.makeSound();
		animal.eat();
		animal.printInfo();
		
		Animal animal2 = new Dog("Bobik", 2);
		animal2.makeSound();
		animal2.eat();
		animal2.printInfo();
		
	}
}
