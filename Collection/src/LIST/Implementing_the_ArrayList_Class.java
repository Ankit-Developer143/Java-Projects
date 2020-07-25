package LIST;

import java.util.*;
/*LIST:- ArrayList , LinkedList , Stack Vector 
 * Implementing the List:-ArrayList , LinkedList*/

public class Implementing_the_ArrayList_Class {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("Dog");
		obj.add("Elephant");
		obj.add("Monkey");

		System.out.println(obj);

		// get Index Value
		String str = obj.get(1);// [Dog, Elephant, Monkey]
		System.out.println(str);// Elephant

		// Size of List
		int len = obj.size();
		System.out.println(len);// length:-3

		// remove()
		String rem = obj.remove(1);
		System.out.println("Removed:" + rem);// Elephant
		System.out.println("Then:" + obj);/*
											 * op:-Then:[Dog, Monkey]
											 */

		// set Value
		obj.set(0, "Donkey");
		obj.set(1, "Tiger");
		// obj.set(2, "Cow"); use this throw Error index outof Bond
		System.out.println(obj);
		
		
		//Converting ArrayList To Array
		String arr[] = new String[obj.size()];
		
		//convert ArrayList to Array
		obj.toArray(arr);
		
		//for Each Loops For Array Iteration
		for(String item : arr) {
			System.out.println(item);
		} /* op 
		Donkey
        Tiger*/
		
		
		//Array To Array List
		
		List<String> animals = new ArrayList<>(Arrays.asList(arr));
		System.out.println(animals);
		
			
		
		
		

	}

}
