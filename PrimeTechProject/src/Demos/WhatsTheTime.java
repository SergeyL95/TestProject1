package Demos;

public class WhatsTheTime {
	
public static void main(String[] args) {
	
	int timeNow = 1;
	boolean isAm = false;
	
	if (timeNow <= 12 && isAm == true) {
		System.out.println("It's a Breakfast time");
		
	} else if (timeNow >= 1 && timeNow <= 2 && isAm == false) {
		System.out.println("It's a Lunch time");
		
	} else if (timeNow >= 5 && isAm == false) {
		System.out.println("It's a Dinner time");
	}
	
}
}
