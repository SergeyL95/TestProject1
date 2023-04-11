package January18;

public class DemoStudent {
	
	public static void main(String[] args) {
		
		Student stud1 = new Student("Jim", "Carrey", 60, true);
		Student stud2 = new Student("Leo", "DiCaprio");
		
	
		stud1.printStudentInfo();
		System.out.println("------");
		stud2.printStudentInfo();
		
		
	}
}
