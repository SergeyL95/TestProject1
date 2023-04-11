package Demos;

public class IfStatement {
	public static void main(String[] args) {
		int angleOne = 47;
		int angleTwo = 78; 
		int angleThree = 90;
		boolean isTriangle = angleOne + angleTwo + angleThree == 180;
		
		if (isTriangle) {
			System.out.println ("Triangle is valid");
		} else {
			System.out.println ("Triangle is not valid");
		}
		
	}
}
