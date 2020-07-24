package ArrayList;

import java.util.ArrayList;

public class For_Each_Loops {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cow");
		animals.add("Elephant");
		animals.add("pig");

		// Check Size
		System.out.println(animals.size());

		// For Each Loops
		for (String Animals : animals) {
			System.out.println(Animals);

		}
	}

}
