package ArrayList;

import java.util.ArrayList;

public class Using_Index_Value_to_Add_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add(0, "Elephant");
		animals.add(1, "Dog");
		int result = animals.indexOf("Elephant");
		System.out.println(result);
	}

}
