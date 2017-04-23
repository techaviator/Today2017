package day8.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapex {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "England");
		map.put(102, "India");
		map.put(101, "English");
		map.put(103, "England");
		map.put(104, "France");
		map.put(105, null);
		map.put(110, null);
		map.put(null, "Japan");
		map.put(106, "China");
		map.put(null, "chile");
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(101, "English");
		map1.put(102, "India");
		map1.put(101, "England");
		map1.put(103, "England");
		map1.put(104, "France");
		map1.put(105, null);
		map1.put(111, null);
		map1.put(null, "Japan");
		map1.put(106, "China");
		map1.put(null, "chech");
		
		System.out.println(map);
		System.out.println(map1);
		
		/*Integer key =102;
		
		System.out.println(map.get(key));*/
		for(Integer key:map1.keySet()){
			if(!map.containsKey(key)){
				System.out.println(key+"\t"+map1.get(key));
			}
		}
		
		
	
	}

}
