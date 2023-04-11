package January25;

public class Person {
	public String name;
	public int age;
	
	public Person () {
		System.out.println("No arg constructor");
	}
	
	public void printInfo() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
	
	
}
