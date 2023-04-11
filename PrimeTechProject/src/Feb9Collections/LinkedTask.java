package Feb9Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedTask {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Rick");
		list.add("Morty");
		list.add("Summer");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			 System.out.println(it.next());
	}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		for(String each : list) {
			System.out.println(each);
		}
		
	}
}
