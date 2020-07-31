package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(1);
		s.add(8);
		s.add(6);
		s.add(4);
		
		System.out.println("Set Using Tree Set: "+s);
		//Set Using Tree Set: [1, 4, 6, 8]
		
		//Accessing element using iterator
		
		
		Iterator<Integer> itr = s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
			/*
			 * 1 4 6 8
			 */
		
	}
		
	}

}
