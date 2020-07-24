package ArrayList;

import java.util.*;

/*hasNext() returns true if there is a next element in the array list.
next() returns the next element in the array list*/

public class Iterator_Demo {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cow");
		animals.add("Elephant");
		animals.add("pig");
		// System.out.println(animals);

		Iterator<String> itr = animals.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		/*
		 * op:-Cow Elephant pig
		 */

	}

}
