package Feb9Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortingHashSet {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(123);
		set.add(45);
		set.add(364);
		set.add(78);
		System.out.println("Before sorting: " + set);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println("After ASC sorting: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After DESC sorting: " + list);
	}
}
