package STACK;

import java.util.Iterator;
import java.util.Stack;
/*Since Stack extends the Vector class,
it inherits all the methods Vector.*/

public class Iteration {
	public static void main(String[] args) {
		Stack<Integer> stacks = new Stack<Integer>();
		
		//To add an element to the top of the stack, we use the push() method
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		System.out.println(stacks);//op:-[1,2,3,4]
		
		
		//Iteration 
		Iterator<Integer> itr = stacks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//op
			/*
			 * 1
			 * 2 
			 * 3 
			 * 4
			 */
			
			
			
			//POP()
			stacks.pop();
			System.out.println(stacks);
			
			/* op:- here java.util.ConcurrentModificationException
			 * bcoz Stack extend the vector class and vector follow synchronization method
			 * and  to method are same time requesting*/
			
		}
		
	}

}
