package Set;

import java.util.NavigableSet;
import java.util.TreeSet;

//Sorted Value

public class Navigable_Set {
	public static void main(String[] args) {
		   // Creating NavigableSet using the TreeSet
       NavigableSet<Integer> numbers = new TreeSet<Integer>();
        // Insert elements to the set
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);
        //NavigableSet: [1, 3, 4]
        
        //Access first element
        System.out.println("Access First Element :" +numbers.first());//op:-1
        System.out.println("Access Last Elements :" +numbers.last());  //op:-4
        
        
        System.out.println("Decending order" +numbers.descendingSet());//op:Decending order[4, 3, 1]
        
        //ceiling() - returns the lowest element among 
        //those elements that are greater than or equal to the specified element
        System.out.println(numbers.ceiling(2)); // op:-3   2 near by  ( less than or equal)
        
        //floor() - returns the greatest element among those elements that are less than or equal to the specified element
        System.out.println(numbers.floor(8)); //op:-largest Number 8 near by op:- 4( less than or equal)
        
        
        
	}

}
