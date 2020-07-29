package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*In a regular queue, elements are added from the rear and removed from the front. However, in a deque, we can insert and remove elements from both front and rear.*/
public class ArrayDeque_Demo {
	public static void main(String[] args) {
		Deque<Integer> numbers = new ArrayDeque<Integer>();

		// add Element to the Deque
		numbers.offer(1);
		numbers.offer(2);

		// add first
		numbers.offerFirst(0);

		// add last
		numbers.offerLast(3);
		System.out.println("Deque Value:" + numbers);

		// remove first
		numbers.removeFirst();

		// remove last
		numbers.removeLast();
		System.out.println("Remove First:" + numbers);
		System.out.println("Remove Last:" + numbers);

		// peekFirst() - Returns the first element of the deque. Returns null if the
		// deque is empty.
		System.out.println("Peek Value:" + numbers.peekFirst());

		// peekLast()
		System.out.println("Peek Value:" + numbers.peekLast());
		
		//pollfirst():-return and remove first element of the deque.
		System.out.println("Poll first Value:" + numbers.pollFirst());
		System.out.println(numbers);//only [2] left
		
		//push() - adds an element at the beginning of deque
		numbers.push(6);
		System.out.println("Push:"+numbers);
		
		//pop remove element from begining of the deque
		numbers.pop();
		System.out.println("POP methods:"+numbers);
		

		// op:-Deque Value:[0, 1, 2, 3]
		// op:-Remove First:[1, 2, 3]
		// op:-Remove Last:[1, 2]
		// op:-Peek Value:1
		// op:-Peek Value:2
		//Poll first Value:1
		//op:-Push:[6, 2]
		//op:-POP methods:[2]

	}

}
