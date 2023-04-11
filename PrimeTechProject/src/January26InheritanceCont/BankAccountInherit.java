package January26InheritanceCont;

public class BankAccountInherit {
	private String ssn;
	private String username;
	private String password;
	private long accountNumber;
	
	protected long routingNumber;
	protected String bankName;
	protected String bankAddress;
	protected double accountBalance;
	protected String firstName;
	protected String lastName;
	protected String email;
	

	
	public void displayAccountInfo() {
	
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		if (ssn.length()==9) {
		this.ssn = ssn;
		} else {
			System.out.println("Invalid format SSN");
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.length()>=6 && username.length()<=12) {
		this.username = username;
		} else {
			System.out.println("Invalid user name");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length()>=6 && password.length()<=12) {
			this.password = password;
			} else {
				System.out.println("Invalid password");
			}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	
	
	
	
}
