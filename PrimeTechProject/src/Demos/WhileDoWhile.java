package Demos;

import java.util.Scanner;

public class WhileDoWhile {
	public static void main(String[] args) {
		
		//while loop
//		int num = 10;
//		while (true) {
//			System.out.println("Good evening");
//			num--;
//			if(num == 5) {
//				break;
//			}
//		}
//		
//		//do..while loop
//		int num2 = 12;
//		do {
//			num2++;
//			System.out.println(num2);
//		} while (num2 < 20);
		
		String correctName = "test123";
		String correctPass = "ps123";
		
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = input.next();
		System.out.println("Please enter your password");
		String password = input.next();
		if(username.equals(correctName) && password.equals(correctPass)) {
			System.out.println("Correct! Access granted.");
			break;
		} else { 
			System.out.println("Invalid credentials, try again.");
		}
		
		}
			
		
	}
}
