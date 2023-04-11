package January26InheritanceCont;

public class Person {
	String name = "person";
	int age;
	String gender;
	
	public Person() {
		System.out.println("Person Constructor");
	}
	
	public Person (String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void speak() {
		System.out.println("Person is speaking");
	}
	
	public void run() {
		System.out.println("Person is Running");
	}
}
