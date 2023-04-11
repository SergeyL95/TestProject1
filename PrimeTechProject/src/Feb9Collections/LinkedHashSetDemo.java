package Feb9Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	LinkedHashSet<String> jobTitles = new LinkedHashSet<String>();
	jobTitles.add("SDET");
	jobTitles.add("FrontEnd Dev");
	jobTitles.add("BackEnd Dev");
	jobTitles.add("Business Analyst");
	jobTitles.add("Product Owner");
	
	System.out.println(jobTitles);
	
	
}
}
