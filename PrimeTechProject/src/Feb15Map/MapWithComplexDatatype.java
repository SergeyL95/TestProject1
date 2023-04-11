package Feb15Map;

import java.util.HashMap;

public class MapWithComplexDatatype {
	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(111, new Student("Sergey", 27, 111));
		studentMap.put(222, new Student("Bijan", 23, 222));
		studentMap.put(333, new Student("Irada", 25, 333));
		studentMap.put(444, new Student("Brandon", 30, 444));
		
		System.out.println(studentMap);
		
		
		
	}
}
