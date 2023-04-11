package Feb15Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> students = new TreeMap<Integer,String>();
		students.put(124, "Ahmet");
		students.put(241, "Ernesto");
		students.put(435, "Ansari");
		
		System.out.println(students);
		
		Set<Entry<Integer,String>> studentEntries = students.entrySet();
		for(Entry<Integer,String> entries : studentEntries) {
			System.out.println("Key: " + entries.getKey() + ", Value: " + entries.getValue());
		}
		
	}
}
