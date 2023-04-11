package Feb15Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sergey");
		map.put(2, "Michael");
		map.put(3, "James");
		
		System.out.println(map);
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.putAll(map);
		System.out.println(map2);
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		List<String> valuesList = new ArrayList<String> (values);
		System.out.println(valuesList);
		
		
	}
}
