package Feb2Polymorhysm;

public abstract class Animal {
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract void sound();
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("WOOF");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("MEOW");
	}
}

class Duck extends Animal {
	@Override
	public void sound() {
		System.out.println("Quak Quak");
	}
}