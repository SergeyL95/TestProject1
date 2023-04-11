package January19;

public class Person {
	//static member that belongs to the Person class
	static String breed = "human";
	
	//instance variables
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getPersonInfo() {
		System.out.println("*****PERSON INFO*****");
		System.out.println("breed: " + Person.breed);
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("*********************");
	}
	
	public static void printBreed() {
		System.out.println("Breed: " + Person.breed);
	}
}
