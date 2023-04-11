package Feb9Collections;

import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Double> salary = new LinkedList<Double>();
		salary.add(250000.0);
		salary.add(200000.0);
		salary.add(123000.0);
		salary.add(100000.0);
		System.out.println("Before storing: " + salary);
		 
	
		Collections.sort(salary);
		System.out.println("ASC storing: " + salary);
		
		Collections.sort(salary, Collections.reverseOrder());
		System.out.println("DESC storing: " + salary);
	}
}
