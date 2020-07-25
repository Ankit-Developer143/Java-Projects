package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

//first Provide Priority to the Lower Values first
public class PriorityQueue_Demo {
	public static void main(String[] args) {
		 // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(5);
        numbers.offer(8);
        numbers.offer(1);
        // Access elements of the Queue
        System.out.println("Queue: " + numbers);
        //op:-Queue: [1, 8, 5]
        
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
	}
	
	/* op :-
* Queue: [1, 8, 5]
Accessed Element: 1
Removed Element: 1
Updated Queue: [5, 8]
*/

}
