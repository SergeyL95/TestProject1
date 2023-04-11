package HomeWorkJan22;

import java.util.Scanner;

public class MortgageAccount {
	
	static String bankName = "BoFA";
	static String bankAddress = "1050 Old St Augustine Rd, Jacksonville, FL 32258";
	
	int loanAmount;
	double accountBalance;
	String mortgageType;
	double monthlyPayment;
	int mortgageTerm;
	
	private double interestRate;
	
	public MortgageAccount () {
		this.loanAmount = 500000;
		this.accountBalance = 481133.12;
		this.mortgageType = "Fixed-rate";
		this.monthlyPayment = 2007.78;
		this.mortgageTerm = 30;
		this.interestRate = 4.9;
	}

	public MortgageAccount (int loanAmount, double accountBalance, String mortgageType, double monthlyPayment, int mortgageTerm, double interestRate) {
		this.loanAmount = loanAmount;
		this.accountBalance = accountBalance;
		this.mortgageType = mortgageType;
		this.monthlyPayment = monthlyPayment;
		this.mortgageTerm = mortgageTerm;
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		if (interestRate > 3 && interestRate < 5) {
		this.interestRate = interestRate;
		System.out.println("The interest rate was set to: " + this.interestRate + "%\n");
		} else {
			System.out.println("Can't set the value. Interest rate should be between 3-5%. Please try again.\n");
		}
	}

	
	public double getInterestRate() {
		System.out.println("Interest rate on thios account is: " + this.interestRate + "%\n");
		return this.interestRate;
	}
	
	public void displayAccountInfo() {
		System.out.println("**********ACCOUNT INFO**********");
		System.out.println("Bank name: " + bankName);
		System.out.println("Bank address: " + bankAddress);
		System.out.println("Loan amount: $" + this.loanAmount);
		System.out.println("Account balance: $" + this.accountBalance);
		System.out.println("Mortgage type: " + this.mortgageType);
		System.out.println("Mortgage term: " + this.mortgageTerm + " years");
		System.out.println("Monthly payment: $" + String.format("%.2f", this.monthlyPayment));
		System.out.println("Interest rate: " + this.interestRate + "%");
		System.out.println("*************END****************\n");
		
	}
	
	public void setMonthlyPayment() {
		this.monthlyPayment = (this.loanAmount + this.loanAmount*(this.interestRate/100))/(this.mortgageTerm*12);
		System.out.println("Monthly payment was updated in this account to: $" + String.format("%.2f", this.monthlyPayment) + " \n");
	}
	
	public void makePayment() {
		this.accountBalance -= this.monthlyPayment;
		System.out.println("Thank you for monthly payment! Your remaining balance is: $" + String.format("%.2f", this.accountBalance));
	}
	
	public void makePayment(double paymentAmount) {
		this.accountBalance -= paymentAmount;
		System.out.println("Thank you for monthly payment! Your remaining balance is: $" + String.format("%.2f", this.accountBalance));
	}
	
	//Overload - payment based on passed amount
	public void makeCustomPayment(double paymentAmount) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the amount for your payment:");
		paymentAmount = input.nextDouble();
		this.accountBalance -= paymentAmount;
		System.out.println("Thank you for payment! Your remaining balance is: $" + String.format("%.2f", this.accountBalance));
	}
}
