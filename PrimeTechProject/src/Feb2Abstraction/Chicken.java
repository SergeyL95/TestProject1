package Feb2Abstraction;

public class Chicken extends Bird{

	Chicken(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void test() {
		System.out.println("This is CHICKEN");
		
	}

	@Override
	void makeSound() {
		System.out.println("Ko-ko-ko");
		
	}
	
	
}
