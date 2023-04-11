package January19;

public class Employee {
	String name;
	int age;
	private long salary;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setSalary (long salary) {
		if (salary>=300000) {
		this.salary = salary;
		} else {
			System.out.println("Salary should be more than 300k");
		}
	}
	
//	public long getSalary() {
//		System.out.println(this.salary);
//		return this.salary;
//	}
	
	
}
