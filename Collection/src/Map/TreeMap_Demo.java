package Map;

import java.util.Map;
import java.util.TreeMap;
/*A TreeMap is always sorted based on keys. The sorting order follows the natural ordering of keys. ...
A TreeMap cannot contain duplicate keys.
TreeMap cannot contain the null key. However, It can have null values.
TreeMap is not synchronized.*/ 



public class TreeMap_Demo {
	public static void main(String[] args) {
		// Creating Map using TreeMap
		Map<String, Integer> values = new TreeMap<>();

		// Insert elements to map
		values.put("Third", 3);
		values.put("First", 1);
		values.put("eight", 8);
		values.put("Second", 2);
		
		//accept only one null Value example:throw exception values.put(null, null); 
		values.put("nine", null);
		
		System.out.println("Tree Map Values :" +values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
        
        System.out.println("Value present ornot: " +values.containsKey("Third"));
        
 

	}
	/*
	 *Tree Map Values :{First=1, Second=2, Third=3, eight=8, nine=null}
      New Map: {First=11, Second=22, Third=3, eight=8, nine=null}
      Removed Value: 11
      Value present ornot: true

	 */


}
