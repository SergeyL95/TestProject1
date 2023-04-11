package Demos;
import java.util.Scanner;

public class CharFounder {
	public static void main(String[] args) {
		String letter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		letter = input.next();
		
		switch (letter) {
		
		case "A":
			System.out.println("Found");
			break;
//		case 'B':
//			System.out.println("Found");
//			break;
//		case 'C': 
//			System.out.println("Found");
//			break;
//		case 'D':
//			System.out.println("Found");
//			break;
//		case 'E':
//			System.out.println("Found");
//			break;
		default:
			System.out.println("Not found");
		}
	}
}
