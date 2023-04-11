package HomeWorkJan29;

public class SDETCourse extends PrimeTech{
	public String startDate;
	public String endDate;
	public String classType;
	public String[] topics;

	public SDETCourse (String schoolName, String address, String phoneNumber, String instructors, String startDate, String endDate, String classType, String topics) {
		super(schoolName, address, phoneNumber, instructors);
		this.topics = new String [3];
		this.startDate = startDate;
		this.endDate = endDate;
		this.classType = classType;

		for(int i=0; i<this.topics.length; i++){
			this.topics[i] = topics;
		}
	}
	
	public void printCourseInfo() {
		System.out.println("*****COURSE INFO*****");
		System.out.println("School Name: " + this.schoolName);
		System.out.println("School Address: " + this.address);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println("Instructors: " + this.instructors[0] + " and " + this.instructors[1]);
		System.out.println("Start Date: " + this.startDate);
		System.out.println("End Date: " + this.endDate);
		System.out.println("Class Type: " + this.classType);
		System.out.println("********END********");
	}
}
