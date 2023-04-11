package Feb9Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTask {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Harry");
		set.add("David");
		set.add("Jack");
		set.add("Harry");
		set.add("Faris");
		set.add("Faris");
		
		//Access to element with ForEach loop
		System.out.println("For Each:");
		for(String each : set) {
			if(each.equals("Jack")) {
				System.out.println("Jack is here");
				break;
			}
		}
		
		//Converting HashSet to Array
		System.out.println("\nto Array:");
		String[] setArr = set.toArray(new String[set.size()]);
		System.out.println(setArr[1]);
		System.out.println(setArr[2]);
		
		System.out.println(set);
		
		//Iterator
		System.out.println("\nIterator:");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Converting HashSet to ArrayList
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println("\nto ArrayList:");
		System.out.println(list);
		
		
		

	}
}
