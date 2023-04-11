package Feb2ArrayList;

import java.util.ArrayList;

public class CollectionsClass {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element");
		list1.add("element 2");
		list1.add("element 3");
		list1.remove(1);
		System.out.println(list1.isEmpty());
		System.out.println(list1);
	}
}
