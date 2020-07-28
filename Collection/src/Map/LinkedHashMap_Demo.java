package Map;

import java.util.LinkedHashMap;
//Accept Duplicate Values print only one times
//Accept null values print only one times

public class LinkedHashMap_Demo {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> number = new LinkedHashMap<>();
		number.put("one", 1);
		number.put("two", 2);
		number.put("three",3);
		number.put("four", 4);
		number.put(null, null);
		number.put(null, null);
		number.put("four", 4);
		System.out.println("LinkedHasMap Stored values :"  +number);
		
		System.out.println("Key Set :" +number.keySet());
		
		
		
		
		System.out.println();

	}

}
