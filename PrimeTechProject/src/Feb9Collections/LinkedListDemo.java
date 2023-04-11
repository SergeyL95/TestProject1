package Feb9Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("From list");
		list.add("From list 2");
		list.add("From list 3");
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Rick");
		names.add("Morty");
		names.add("Summer");
		names.add(2, "Beth");
		
		System.out.println(names);
		//String elem = names.remove();
		//System.out.println(elem);
		System.out.println(names.size());
		
		names.addAll(list);
		System.out.println(names);
		
		Object obj = names.clone();
		LinkedList<String> namesClone = (LinkedList<String>)obj;
		System.out.println(namesClone);
		
		System.out.println(names.poll());
	}
}
