package Feb2Polymorhysm;

public class Calculator {
	public  void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public  void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public  void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public  void add(long a, long b) {
		System.out.println(a + b );
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.add(1, 2);
		calc.add(1, 2, 3);
		calc.add(1.2, 2.1);
		calc.add(1123113, 21231224);

	}
}
