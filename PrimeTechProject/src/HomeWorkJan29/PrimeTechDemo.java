package HomeWorkJan29;

public class PrimeTechDemo {
	public static void main(String[] args) {
		
		SDETCourse c1 = new SDETCourse("PrimeTech", "VA", "777-777-777", "Polat", "Ajay", "10/24/2022", "05/01/2023", "Online");
		
		c1.printCourseInfo(); //all members Parent and Child
		
		//PrimeTech c2 = new SDETCourse("PrimeTech", "VA", "777-777-777", "10/24/2022", "05/01/2023", "Online");
		
		//can call only Parent members
		
		//SDETCourse c3 = new PrimeTech("PrimeTech", "VA", "777-777-777");
		//won't compile
	
	}
}
