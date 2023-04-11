package Feb15Map;

public class Student {
	private String name;
	private int age;
	private int stidentId;
	
	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		this.stidentId = studentId;
	}
	
	public String toString() {
		String str = "Name: " + this.name + ", Age: " + this.age + ", ID: " + this.stidentId + "\n";
		return str;
	}
	
}
