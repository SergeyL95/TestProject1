package January18;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		System.out.println("No-arg here");
		this.name = "Robot";
		this.age = 5;
	}
	
	public Person (String name) {
		this.name = name;
	}
	
	public Person (int age) {
		this.age = age;
	}
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
}
