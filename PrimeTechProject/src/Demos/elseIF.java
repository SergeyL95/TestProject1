package Demos;

public class elseIF {
public static void main(String[] args) {
	
	int score = 6000;
	
	if (score >= 5000) {
		System.out.println("Your score was >= 5000");
	} else if (score < 100 && score >= 500) {
		System.out.println("Your score was < 1000 but >= 500");
	} else {
		System.out.println("Your score was < 500");
	}
}
}
