package OOP;

public class ChildTwo extends Parent{
	private String name;
	
	public void playTime() {
		System.out.println("It's play time for " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
