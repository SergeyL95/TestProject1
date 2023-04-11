package January26InheritanceCont;

import java.util.Scanner;

public class MortgageAccountInherit extends BankAccountInherit{
	
	static String bankName = "BoFA";
	static String bankAddress = "1050 Old St Augustine Rd, Jacksonville, FL 32258";
	
	int loanAmount;
	double accountBalance;
	String mortgageType;
	double monthlyPayment;
	int mortgageTerm;
	
	private double interestRate;
	
	public MortgageAccountInherit () {
		this.loanAmount = 500000;
		super.accountBalance = 481133.12;
		this.mortgageType = "Fixed-rate";
		this.monthlyPayment = 2007.78;
		this.mortgageTerm = 30;
		this.interestRate = 4.9;
	}

	public MortgageAccountInherit (int loanAmount, double accountBalance, String mortgageType, double monthlyPayment, int mortgageTerm, double interestRate) {
		this.loanAmount = loanAmount;
		super.accountBalance = accountBalance;
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
		System.out.println("Bank name: " + super.bankName);
		System.out.println("Bank address: " + super.bankAddress);
		System.out.println("First Name: " + super.firstName);
		System.out.println("Last Name: " + super.lastName);
		System.out.println("SSN: " + super.getSsn());
		System.out.println("Account Number: " + super.getAccountNumber());
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
