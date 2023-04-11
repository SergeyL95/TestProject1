package Feb2AbstractionCont;

public class ChaseBankATM implements ATM{

	private double balance = 0;
	
	@Override
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Amount you want to withdraw must be less than your balance");
		} else {
		this.balance -= amount;
		System.out.println("Amount: " + amount + "was withdrawed");
		}
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount: " + amount + " added to your balance");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("The balance is: " + this.balance);
	}
	
}
