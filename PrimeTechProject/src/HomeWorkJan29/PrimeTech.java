package HomeWorkJan29;

public class PrimeTech {
	public String schoolName;
	public String[] instructors;
	public String address;
	public String phoneNumber;
	
	public PrimeTech (String schoolName, String address, String phoneNumber, String instructors) {
		this.instructors = new String[2];
		this.schoolName = schoolName;
		this.address = address;
		this.phoneNumber = phoneNumber;

		for(int i=0; i<this.instructors.length; i++) {
			this.instructors[i] = instructors;
		}
	}
}
