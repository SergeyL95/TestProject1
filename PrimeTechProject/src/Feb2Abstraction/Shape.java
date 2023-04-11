package Feb2Abstraction;

public abstract class Shape {
	
	int color;
	
	//concrete method with body
	public void printInfo() {
		System.out.println("Printing info");
	}
	
	//abstract method w/o body
	public abstract void draw();
}
