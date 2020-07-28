package Map;

import java.util.HashMap;
import java.util.Map;

/*In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.

A map cannot contain duplicate keys. And, each key is associated with a single value.
*/

//Accept Null Values
public class HashMap_Demo {
	public static void main(String[] args) {
		Map<String, Integer> obj = new HashMap<>();
		obj.put("one", 1);
		obj.put("two", 2);
		//obj.put(null, null);
		System.out.println(obj);

		// Access key of the map
		System.out.println("access Key:" + obj.keySet());

		// Access Value of the map
		System.out.println("Access Value : " + obj.values());

		// entrySet() - Returns a set of all the key/value mapping present in a map.
		System.out.println("Access all entries  :" + obj.entrySet());

		// remove (key ,value) pair from the map
		System.out.println("Remove element:" + obj.remove("one", 1));

		// remove only key
		System.out.println("remove Key:" + obj.remove("two"));
		System.out.println("Check Which Element is present " + obj);
		
		
		
		
		// op:-access Key:[one, two]
		// op:-Access Value : [1, 2]
		// op:-Remove element:true
		// op:-remove Key:2
		// op:-Check Which Element is present : {}

	}

}
