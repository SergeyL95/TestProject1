package January19;

public class Start {
	public static void main(String[] args) {
		Person p1 = new Person("Jim", 50);
		Person p2 = new Person("Walter", 55);
		Person p3 = new Person("Saul", 40);
	
	p1.getPersonInfo();
	p2.getPersonInfo();
	p3.getPersonInfo();
	
	Person.printBreed();
	
	}

}
