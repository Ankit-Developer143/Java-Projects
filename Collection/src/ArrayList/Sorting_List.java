package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_List {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();

		// Add elements in the array list
		animals.add("Horse");
		animals.add("Zebra");
		animals.add("Dog");
		animals.add("Cat");

		System.out.println("Unsorted ArrayList: " + animals);

		// Sort the array list
		Collections.sort(animals);
		System.out.println("Sorted ArrayList: " + animals);

	}
	// OP:-Unsorted ArrayList: [Horse, Zebra, Dog, Cat]
	// Sorted ArrayList: [Cat, Dog, Horse, Zebra]

}
