package ArrayList;

import java.util.ArrayList;

public class ArrayList_to_Array {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();

		// Add elements in the array list
		animals.add("Horse");
		animals.add("Zebra");
		animals.add("Dog");
		animals.add("Cat");
		System.out.println(animals);// op:-ArrayList:- [Horse, Zebra, Dog, Cat]

		// Create a new array of String type
		String arr[] = new String[animals.size()];

		// Converting ArrayList to Array
		animals.toArray(arr);

		
		 for(String item:arr) { 
			 System.out.println(item);
			 }
		 
		/*Array:-
		 * op:-Horse
		 *  Zebra
		 *   Dog
		 *   Cat
		 */
		 
	}

}
