package Feb8Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
//		Student st1 = new Student ("Sergey", 27, 1);
//		Student st2 = new Student ("Polat", 30, 2);
//		Student st3 = new Student ("Patrick", 28, 3);
//		
//		ArrayList<Student> studentList = new ArrayList<Student>();
//		studentList.add(st1);
//		studentList.add(st2);
//		studentList.add(st3);

		
//		Iterator<Student> it = studentList.iterator();
//		
//		while(it.hasNext()) {
//			 it.next().printInfo();
//		}
		
		
//		for(int i=0; i<studentList.size(); i++) {
//			studentList.get(i).printInfo();
//			System.out.println(" ");
//		}
		
//		for (Student name : studentList) {
//			name.printInfo();
//		}
		
		
		
		
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Lawrence");
		list1.add("Mahomes");
		list1.add("Brady");
		list1.add(2, "Kelce");
		list1.set(3, "Bijan");
		
		System.out.println(list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
//		
//		System.out.println("Before sorting: " + list1);
//		Collections.sort(list1);
//		System.out.println("After sorting: " + list1);
//		
//		System.out.println(list1.get(1));
//		
//		System.out.println(list1.indexOf("Lawrence"));
//		
//		list1.remove("Brady");
//		
//		System.out.println(list1);
//		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list2.add(444);
//		list2.add(123);
//		list2.add(555);
//		
//		System.out.println(list2);
//		Collections.sort(list2, Collections.reverseOrder());
//		System.out.println(list2);
//		Iterator<Integer> it = list2.iterator();
		
		
		
//		for (int i=0; i<list2.size(); i++) {
//			Integer elem = new Integer(list2.get(i));
//			System.out.println(elem);
//		}
//		
//		for (int num : list2) {
//			System.out.println(num);
//		}
		
		
		
		
	}
}
