package Demos;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		
		System.out.println("Please enter the number:");
		
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		int res = 0;
		
		for (int i=1; i<=num; i++) {
			res = num * i;
			for (int j=1; j<num; j++) {
				res = i * j;
				System.out.println(i + " x " + j + " = " + res);
			}
			System.out.println(i + " x " + num + " = " + res);
		}
		
	}
}
