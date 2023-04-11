package Feb2AbstractionCont;

public class ATMDemo {
	public static void main(String[] args) {
		ATM atm1 = new ChaseBankATM();
		atm1.deposit(100000);
		atm1.withdraw(1000);
		atm1.checkBalance();
		
		ATM atm2 = new BoFAATM();
		atm2.deposit(200000);
		atm2.withdraw(500);
		atm2.checkBalance();
	}
}
	
	
