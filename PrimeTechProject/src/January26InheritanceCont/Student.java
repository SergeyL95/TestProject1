package January26InheritanceCont;

public class Student extends Person{
	String name = "student";
	
	public Student() {
		super(); //super statement - must be first line
		System.out.println("Student Constructor");
	}
	
	public Student(String name, int age, String gender) {
		super(name, age, gender);
		System.out.println("Name: " + this.name + ", age: " + this.age + ", gender: " + this.gender);
	}
	
	public void speak() {
		System.out.println("Student is speaking");
	}
	
	public void test() {
		run();
		System.out.println(name);
	}
}
