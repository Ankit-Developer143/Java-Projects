package ArrayList;

import java.util.*;

public class Using_asList_and_get {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>(Arrays.asList("cow", "Elephant", "Pig"));
		System.out.println("Array List: " + animals);// op:-Array List: [cow, Elephant, Pig]

		String index = animals.get(1);
		System.out.println("Element positioning :" + index);// op:-Element positioning :Elephant
		
		
		

	}

}
