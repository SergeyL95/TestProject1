package Demos;

import java.util.Arrays;

public class ArraysPractice {
	public static void main(String[] args) {
	
		int[] numbers = new int[5];
		numbers[0] = 41;
		numbers[1] = 6;
		numbers[2] = 23;
		numbers[3] = 4;
		numbers[4] = 7;
		
		Arrays.sort(numbers);
		
//		System.out.println(Arrays.toString(numbers));
//		
//		Arrays.sort(numbers);
//		String arrayStringed = Arrays.toString(numbers);
//		System.out.println(arrayStringed);
		
//		boolean isFound = false;
//		for (int num : numbers) {
//			if (num==10) {
//				isFound = true;
//				break;
//			}
//		}
//		System.out.println(isFound);
		
		//System.out.println(Arrays.binarySearch(numbers, 7));\
		
	//}
	
	String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	String daysCopy[] = Arrays.copyOf(days, 3);
	System.out.println(Arrays.toString(daysCopy));
		
}
}
