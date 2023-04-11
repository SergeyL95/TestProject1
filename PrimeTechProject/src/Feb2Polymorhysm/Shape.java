package Feb2Polymorhysm;

public interface Shape {
	
	void draw();
	
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing square");
	}
	
}

class Octagon implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing octagon");
	} 
}

class Hexigon implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing hexigon");
	}
}