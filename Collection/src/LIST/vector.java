package LIST;

import java.util.Iterator;
import java.util.Vector;
/*Note:- Vector and ArrayList Are Same Functionality 
 * But Vector Class synchronizes Each Individuals operation 
 * it mens the vector class lock the operation It is because when one thread is accessing a vector,
 * and at the same time another thread tries to access it */




/*SIMILAR TO ARRAY LIST*/
public class vector {
	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		System.out.println(animals);

	}

}
