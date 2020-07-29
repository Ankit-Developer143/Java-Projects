package Navigable_Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigable_Map {
	public static void main(String[] args) {
		NavigableMap<String, Integer> numbers = new TreeMap<>();

		// Insert elements to map
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("Three", 3);
		System.out.println("NavigableMap : " + numbers);
		// op:-NavigableMap : {One=1, Three=3, Two=2}
		
		//access the first entry
		System.out.println("Access The First Element : "+numbers.firstKey());
		System.out.println("Access The First Element : "+numbers.firstEntry());
		//op:-Access The First Element : One
		//op:-Access The First Element : One=1
		
		System.out.println("remove First elements : "+numbers.pollFirstEntry());
		System.out.println(numbers);
		/*
		 * op:-remove First elements : One=1 
		 * {Three=3, Two=2}
		 */
		System.out.println("remove First elements : "+numbers.pollLastEntry());
        System.out.println(numbers);
		/*
		 * op:-remove First elements : Two=2 
		 * {Three=3}
		 */
	}

}
