package January18;

public class Student {
	static int batchNumber = 4;
	
	public Student (String firstName, String lastName, int age, boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isActive = isActive;
	}
	
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
		String firstName;
		String lastName;
		int age;
		boolean isActive;
		
	
	public void initializeStudent (String firstName, String lastName, int age, boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isActive = isActive;
		
		System.out.println("The student info was created.");
	}
	
	public String getStudentName () {
		String fullName = this.firstName + " " + this.lastName;
		System.out.println("Student's name is: " + fullName);
		return fullName;
	}
	
	public int getAge () {
		System.out.println("Student's age is: " + this.age);
		return this.age;
	}
	
	public boolean getActiveStatus () {
		System.out.println("Student's active status is: " + this.isActive);
		return isActive;
	}
	
	public int getBatchNumber() {
		System.out.println("Student's batch number is: " + batchNumber);
		return batchNumber;
	}
	
	public void attendingClass () {
		if (this.isActive) {
			System.out.println("Student is attending the class");
		} else {
			System.out.println("You are not an active student, please enroll to the class");
		}
	}
	
	public void enrollClass () {
		if (!this.isActive) {
			this.isActive = true;
			System.out.println("You have successfully enrolled to the class. Now you are an active student.");
		} else {
			System.out.println("You're already enrolled");
		}
	}
	
	public void deactivateStudent () {
		if (this.isActive) {
			this.isActive = false;
			System.out.println("Studen was deactivated.");
		} else {
			System.out.println("Student was already deactivated");
		}
	}
	
	public void printStudentInfo() {
		System.out.println("Student's first name: " + this.firstName);
		System.out.println("Student's last name: " + this.lastName);
		System.out.println("Student's age: " + this.age);
		System.out.println("Student's active status: " + this.isActive);
		System.out.println("Student's batch number: " + batchNumber);
	}
	
	
}
