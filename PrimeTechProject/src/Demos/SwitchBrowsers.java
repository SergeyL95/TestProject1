package Demos;
import java.util.Scanner;

public class SwitchBrowsers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a name of the browser you're using:");
		String browserUsing = input.nextLine().toLowerCase();
	
		
		switch (browserUsing) {
		case "chrome":
			System.out.println("You're using Google Chrome. Good choice.");
			break;
		case "opera":
			System.out.println("You're using Opera.");
			break;
		case "firefox":
			System.out.println("You're using Firefox.");
			break;
		default:
			System.out.println("You better use Safari then.");
		}
		
	}
}
