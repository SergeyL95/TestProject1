package HomeWorkJan22;

public class MortgageAccDemo {
	public static void main(String[] args) {
		
		MortgageAccount acc1 = new MortgageAccount();
		acc1.setInterestRate(3.7);
		acc1.setMonthlyPayment();
		acc1.displayAccountInfo();
		
		MortgageAccount acc2 = new MortgageAccount(1000000, 1000000, "Conventional", 4000.23, 30, 4);
		acc2.setInterestRate(4.2);
		acc2.setMonthlyPayment();
		acc2.displayAccountInfo();
		
		MortgageAccount acc3 = new MortgageAccount(250000, 58923.98, "Jumbo-loan", 1500, 15, 3);
		acc3.setInterestRate(4.8);
		acc3.setMonthlyPayment();
		acc3.displayAccountInfo();
		
		acc1.makePayment(100000);
		
		
	}
}
