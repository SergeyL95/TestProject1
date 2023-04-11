package Feb15Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapIterating {
	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(111, "Sergey");
		students.put(123, "Irada");
		students.put(234, "Mike");
		students.put(341, "Sudaif");
		
		Set<Entry<Integer,String>> studentEntries = students.entrySet();
		
		System.out.println("For each loop:");
		for(Entry<Integer,String> entry : studentEntries) {
			System.out.println("Key is: " + entry.getKey() + ", and the Value is: " + entry.getValue());
		}
		
		System.out.println("Iterator:");
		Iterator<Entry<Integer, String>> iter = studentEntries.iterator();
		
		while(iter.hasNext()) {
			Entry<Integer, String> pos = iter.next();
			System.out.println("Key is: " + pos.getKey() + ", and the Value is: " + pos.getValue());
		}
	}
}
