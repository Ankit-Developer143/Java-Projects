package ArrayList;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cow");
		animals.add("Elephant");
		animals.add("pig");
		
		animals.remove(1);
		System.out.println(animals);
		//op:-[Cow, pig]
		
		animals.clear();
		System.out.println(animals);
		//op:-[]
		
		
	}

}
