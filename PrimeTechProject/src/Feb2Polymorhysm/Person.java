package Feb2Polymorhysm;

public class Person {
	public void greet(){
		System.out.println("Greeting");
	}
}

class Russian extends Person{
	public void greet(){
		System.out.println("Privet");
	}
}

class Kazakh extends Person{
	public void greet(){
		System.out.println("Kalai Zhagdai Bratishka");
	}
}

class Portuguese extends Person{
	public void greet(){
		System.out.println("Bon dia");
	}
}