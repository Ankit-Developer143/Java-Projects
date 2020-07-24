package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Set_And_Change_Array_TO_ArrayList {
	public static void main(String[] args) {
       
		//Array
		String arr[] = { "cow", "elephant", "Horse" };
		for (String item : arr) {
			System.out.println(item);

		}
		
		
        //Convert Array To ArrayList
		ArrayList<String> animals = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(animals);
	}
	/*
	 * op:-before[Cow,Elephant,pig] 
	 * after[Cow, Horse, pig]
	 */

}
