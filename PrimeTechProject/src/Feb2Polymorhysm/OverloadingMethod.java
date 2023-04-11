package Feb2Polymorhysm;

public class OverloadingMethod {
	
	public static void display(int a) {
		System.out.println("Displaying: " + a);
	}
	
	public static void display(String a) {
		System.out.println("Displaying: " + a);
	}
	
	public static void main(String[] args) {
		OverloadingMethod.display(123);
		OverloadingMethod.display("TEST");
	}
}
