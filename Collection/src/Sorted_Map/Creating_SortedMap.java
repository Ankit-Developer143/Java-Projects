package Sorted_Map;
//Sort The Values

import java.util.SortedMap;
import java.util.TreeMap;

public class Creating_SortedMap {
	public static void main(String[] args) {

		// Create SortedMap
		SortedMap<String, Integer> numbers = new TreeMap<>();

		// Insert elements to map
		numbers.put("Six", 7);
		numbers.put("Two", 2);
		numbers.put("One", 1);

		System.out.println("SortedMap Values" + numbers);
		// op:-SortedMap Values{One=1, Six=7, Two=2}

		// Access The First Key
		System.out.println("Access First key : " + numbers.firstKey());
		// op:-Access First key : One

		// entrySet
		System.out.println(numbers.entrySet());
		// op:-[One=1, Six=7, Two=2]

		/// remove element
		System.out.println("Remove Elements : " + numbers.remove("Six"));
		// op:-Remove Elements : 7
		System.out.println(numbers);
		// op:-{One=1, Two=2}

		System.out.println(numbers.lastKey());
		//op:-Two

	}

}
