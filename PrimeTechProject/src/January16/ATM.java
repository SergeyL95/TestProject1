package January16;

import java.util.Scanner;

public class ATM {
	
	//Instance variable belongs to object of ATM class
	String bankName;
	String location;
	String color;
	String model;
	long cashReserved;
	boolean isActive;
	
	public ATM() {
		this.bankName = "Wells Fargo";
		this.location = "Orange Park";
		this.color = "Red";
		this.model = "XXXYYYZZZ";
		this.cashReserved = 60000;
		this.isActive = false;
	}
	
	public ATM(String bankName, String location, String color, String model, long cashReserved, boolean isActive) {
		this.bankName = bankName;
		this.location = location;
		this.color = color;
		this.model = model;
		this.cashReserved = cashReserved;
		this.isActive = isActive;
	}
	
	public ATM (String bankName, String model) {
		this.bankName = bankName;
		this.model = model;
	}
	
	public void getInfo () {
		System.out.println("***The ATM info***");
		System.out.println("Bank name: " + bankName);
		System.out.println("Location: " + location);
		System.out.println("Color: " + color);
		System.out.println("Model: " + model);
		System.out.println("Cash Reserved: " + cashReserved);
		System.out.println("Is Active: " + isActive);
		System.out.println("******END******\n");
	}
	
	public void setBankName (String bankName) {
		System.out.println("Bank Name on this ATM was updated succesfully.\n");
		this.bankName = bankName;
	}
	
	public void setLocation (String location) {
		System.out.println("Location on this ATM  was updated succesfully.\n");
		this.location = location;
	}
	
	public void setColor (String color) {
		System.out.println("Coloe on this ATM  was updated succesfully.\n");
		this.color = color;
	}
	
	public void setModel (String model) {
		System.out.println("Model on this ATM  was updated succesfully.\n");
		this.model = model;
	}
	
	public void setCashReserved (long cashReserved) {
		System.out.println("Cash Reserved amount on this ATM  was updated succesfully.\n");
		this.cashReserved = cashReserved;
	}
	
	public void setIsActive (boolean isActive) {
		System.out.println("isActive status on this ATM  was updated succesfully.\n");
		this.isActive = isActive;
	}
	
	public void setUpATM(String bankName, String location, String color, String model, long cashReserved, boolean isActive) {
		
		this.bankName = bankName;
		this.location = location;
		this.color = color;
		this.model = model;
		this.cashReserved = cashReserved;
		this.isActive = isActive;
		
		System.out.println("The ATM was sucessfully setted up!\n");
	}
	
	public String getLocation () {
		System.out.println("The Location of the ATM is: " + this.location);
		
		return location;
	}
	
	public String getBankName() {
		System.out.println("The Bank name of the ATM is: " + this.bankName); 
		return bankName;
	}
	
	public String getColor() {
		System.out.println("The Color of the ATM is: " + this.color); 
		return color;
	}
	
	public String getModel() {
		System.out.println("The Model of the ATM is: " + this.model); 
		return model;
	}
	
	public long getCashReserved() {
		System.out.println("The Cash reserved amount of the ATM is: " + this.cashReserved); 
		return cashReserved;
	}
	
	public boolean getStatus() {
		System.out.println("The Status of the ATM is: " + this.isActive); 
		return isActive;
	}
	
	public void withdraw () {
		if (isActive) {
		if(this.cashReserved == 0) {
			System.out.println("Sorry, this ATM has no Cash reserved for withdraw");
		} else {
		System.out.println("What amount you want to withdraw?");
		Scanner input = new Scanner (System.in);
		long withdrawAmount = input.nextLong();
		if (this.cashReserved<withdrawAmount) {
			System.out.println("Sorry, this ATM does not have enough cash reserved to proceed with this withrawal");
		} else { 
		this.cashReserved -= withdrawAmount;
		System.out.println("Withdrawal successful!");
		System.out.println("Cash reserved in the ATM after withdawal is: " + cashReserved);
		}
		}
		} else {
			System.out.println("Sorry, the ATM is offline now.");
		}
	}
	
	public void deposit () {
		if (isActive) {
		System.out.println("What amount you want to deposit?");
		Scanner input = new Scanner (System.in);
		long depositAmount = input.nextLong();
		this.cashReserved += depositAmount;
		System.out.println("Deposit successful!");
		System.out.println("Cash reserved in the ATM after deposit is: " + cashReserved);
		} else {
			System.out.println("Sorry, the ATM is offline now.");
		}
	} 
	
	public void statusSwitch () {
		if (isActive) {
			isActive = false;
			System.out.println("ATM status changed to Offline");
		} else {
			isActive = true;
			System.out.println("ATM status chaged to Online");
		}
	}
	
	public void statusChecker() {
		if (!isActive) {
			System.out.println("Sorry, ATM is offline");
		}
	}
	
}
