package Set;
/*The Java Set interface allows us to perform basic mathematical set operations like union, intersection, and subset.

Union - to get the union of two sets x and y, we can use x.addAll(y)
Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
Subset - to check if x is a subset of y, we can use y.containsAll(x)
*/

import java.util.HashSet;
import java.util.Set;

/*Implemention:-
  
HashSet
LinkedHashSet
EnumSet
TreeSet*/

public class Implemention_Set {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(null);
		System.out.println(s);
		
		
		
		//Add All
		Set <Integer> s1 = new HashSet<>();
		
		s1.addAll(s);
		System.out.println(s1);
		
		
		
		
	}

}
