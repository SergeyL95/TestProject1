package Feb2Polymorhysm;

import java.util.ArrayList;

public class DemoShapes {
	public static void main(String[] args) {
		
//		Shapes shape1 = new Shapes();
//		Shapes shape2 = new Triangle();
//		Shapes shape3 = new Circle();
//		
//		shape1.area();
//		shape2.area();
//		shape3.area();
		
		Shape shape4 = new Square();
		Shape shape5 = new Octagon();
		Shape shape6 = new Hexigon();
		
		shape4.draw();
		shape5.draw();
		shape6.draw();
		
		System.out.println("********************");
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Duck();
		
		animal1.sound();
		animal1.eat();
		
		animal2.sound();
		animal2.eat();
		
		animal3.sound();
		animal3.eat();
		
		System.out.println("********************");
		
		Person rus = new Russian();
		Person kaz = new Kazakh();
		Person por = new Portuguese();
		
		rus.greet();
		kaz.greet();
		por.greet();
		
		
		
		
		
		
	}
}
