package ArrayList;

import java.util.ArrayList;

public class for_loops {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cow");
		animals.add("Elephant");
		animals.add("pig");

		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
			System.out.println(",");
		}

	}
	/*
	 * op:-Cow Elephant pig 
	 * Cow , Elephant , pig ,
	 * 
	 * 
	 */

}
