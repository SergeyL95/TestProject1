package January16;

public class DemoPhone {
	public static void main(String[] args) {
		
	
	Phone phone1 = new Phone();
	
	phone1.brand = "iPhone";
	phone1.model = "14ProMax";
	phone1.color = "Space Gray";
	
	Phone phone2 = new Phone();
	
	phone2.brand = "iPhone";
	phone2.model = "12";
	phone2.color = "Gold";
	
	Phone phone3 = new Phone();
	
	phone3.brand = "Samsung";
	phone3.model = "Galaxy";
	phone3.color = "Black";
	
	System.out.println("Phone 1 data\nBrand: " + phone1.brand + "\nModel: " + phone1.model + "\nColor: " + phone1.color);
	
	System.out.println("-----");
	
	System.out.println("Phone 2 data\nBrand: " + phone2.brand + "\nModel: " + phone2.model + "\nColor: " + phone2.color);
	
	System.out.println("-----");
	
	System.out.println("Phone 3 data\nBrand: " + phone3.brand + "\nModel: " + phone3.model + "\nColor: " + phone3.color);
	
	}
}
