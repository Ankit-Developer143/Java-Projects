package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Creating_Queue {
	public static void main(String[] args) {
		/*
		 * In queues, elements are stored and accessed in First In, First Out manner. 
		 * That is, elements are added from the behind and removed from the front.
		 * In Java, we must import java.util.Queue package in order to use Queue.
		 
		 *Note:-Queue:---------
		 *      Linkedlist
		 *      ArrayDeque
		 *      PriorityQueue
		 */	
		
		Queue<Integer> obj = new LinkedList<Integer>();
		
		//add or offer both used 
		obj.offer(1);
		obj.add(2);
		obj.offer(3);
		obj.add(4);
		System.out.println(obj);//op:-[1,2,3,4]
		
		
		
		//peek(); remove element top of the box
		//throw null if value empty
		Integer result = obj.peek();
		System.out.println(result); //op:-1
		
		//Same as a peek() throw null if value empty
		int removedNumber = obj.poll();
		System.out.println(removedNumber); //op:-1
		
		
		// throw Exception
		int removedNumber1 = obj.remove();
		System.out.println(removedNumber1);//2
	
		
	}

}
