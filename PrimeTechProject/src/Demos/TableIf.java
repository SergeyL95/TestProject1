package Demos;

public class TableIf {
public static void main(String[] args) {
	int a, b, c, avg;
	
	a = 90;
	b = 86;
	c = 75;
	
	avg = (a + b + c)/3;
	
	if (avg >= 90 && avg <= 100) {
		System.out.println("You got A");
	} 
	else if  (avg >= 80 && avg <= 90) {
		System.out.println("You got B");
	}
	else if (avg >= 70 && avg <= 80) {
		System.out.println("You got C");
	} else {
		System.out.println("You got F");
	}
}
}
