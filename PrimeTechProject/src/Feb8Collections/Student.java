package Feb8Collections;

public class Student {
	
	private String name;
	private int age;
	private int id;
	
	public Student (String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void printInfo() {
		System.out.println("********************");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Id: " + this.id);
		System.out.println("*********END********");
	}
	
	
}
