package OOP;

public class ParentDemo {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		ChildOne c1 = new ChildOne();
		ChildTwo c2 = new ChildTwo();
		ChildThree c3 = new ChildThree();
		
		p1.setName("Reed");
		c1.setName("Patrick");
		c2.setName("Travis");
		c3.setName("Juju");
		
		System.out.println(c2.haircolor);
		
		p1.familyTime();
		c1.familyTime();
		c2.playTime();
		c3.playTime();
		
	}
}
