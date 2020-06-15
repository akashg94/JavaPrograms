package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
	
		//implement map interfaces
		//hash map is random order
		//also can change to linked hashmap and tree map
		//linked hashmap is order and tree map is indexing by order
		
		
		HashMap<Integer, String> hMap = new HashMap<Integer,String>();
		
		mapUtill(hMap);

	}
	
	public static void mapUtill(Map<Integer, String> map) {
		//adding key value pair
		
		map.put(101, "Adam");
		map.put(107, "Bob");
		map.put(109, "Roger");
		map.put(112, "Steve");
		
		System.out.println("See all the keys" + map.keySet());
		System.out.println("see all the key value pairs " + map);
		System.out.println(map.get(107));
		//iterate through the map
		for (int key: map.keySet()) {
			System.out.println("Key:" + key + "value : " + map.get(key));
		}
		
	}

}
