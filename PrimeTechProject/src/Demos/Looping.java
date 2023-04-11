package Demos;

import java.util.Arrays;

public class Looping {
	public static void main(String[] args) {
//		for (int i=3; i <=10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("-----------");
//		
//		for (int j=10; j>=5; j--) {
//			System.out.println(j);
//		}
		
		
//		int[] nums = {6, 5, 11, 10, 3, 4, 9};
//		for (int k = 0; k < nums.length; k++) {
//			if (nums[k]%2==0) {
//				System.out.println(nums[k]);
//			}
//		}
		
		for (int n = 1; n <= 30; n++) {
			if (n%2==0) {
				System.out.println("even: " + n);
			} else {
				System.out.println("odd: " + n);
			}
		}
		
		
	}
	
}
