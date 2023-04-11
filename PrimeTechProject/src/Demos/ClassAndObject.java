package Demos;

public class ClassAndObject {
	public static void main(String[] args) {
			
		Dog dog1 = new Dog();
		dog1.age = 3;
		dog1.breed = "Shiba Inu";
		dog1.color = "Black";
		dog1.size = "Medium";
		
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		System.out.println(dog1.size);
		
		Dog dog2 = new Dog();
		
		dog2.age = 1;
		dog2.breed = "Lab";
		dog2.color = "Choco";
		dog2.size = "Large";
		
		System.out.println(dog2.age);
		System.out.println(dog2.breed);
		System.out.println(dog2.color);
		System.out.println(dog2.size);
		
	}
}
