package January16;

public class DemoATM {
	public static void main(String[] args) {
		ATM atm1 = new ATM();
		ATM atm2 = new ATM("BoFA", "ASD789123");
		ATM atm3 = new ATM("Chase", "Jacksonville", "Blue", "JJJ111", 75000, true);
		
		atm1.getInfo();
		atm2.getInfo();
		atm3.getInfo();
		
//		atm1.bankName = "BofA";
//		atm1.location = "Jacksonville";
//		atm1.color = "Red";
//		atm1.model = "XYZ123";
//		atm1.cashReserved = 50000;
//		atm1.isActive = true;
//		
//		ATM atm2 = new ATM();
//		
//		atm2.bankName = "Chase";
//		atm2.location = "Jacksonville";
//		atm2.color = "Blue";
//		atm2.model = "XYZ123";
//		atm2.cashReserved = 100000;
//		atm2.isActive = true;
//		
//		//System.out.println("The ATM data\nBank name: " + atm1.Bankname + "\nColor: " + atm1.color + "\nLocation: " + atm1.location + "\nModel: " + atm1.model + "\nCash reserved: " + atm1.cashReserved + "\nIs Active: " + atm1.isActive);
//		
//		//System.out.println("-------------");
//		
//		//System.out.println("The ATM data\nBank name: " + atm2.Bankname + "\nColor: " + atm2.color + "\nLocation: " + atm2.location + "\nModel: " + atm2.model + "\nCash reserved: " + atm2.cashReserved + "\nIs Active: " + atm2.isActive);
//		
//		atm1.getInfo();
//		atm2.getInfo();
//		
//		atm1.setBankName("Wells Fargo");
//		atm1.setLocation("St Augustine");
//		atm1.setColor("Black");
//		atm1.setModel("HGJ123");
//		atm1.setCashReserved(1000000);
//		atm1.setIsActive(false);
//		
//		atm1.getInfo();
//		
//		ATM atm3 = new ATM();
//		atm3.setUpATM ("TD Bank", "NYC", "Green", "HJASDG707", 213561, true);
//		
//		atm3.getInfo();
	}
}
