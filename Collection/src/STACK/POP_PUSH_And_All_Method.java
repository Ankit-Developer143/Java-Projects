package STACK;

import java.util.Stack;

public class POP_PUSH_And_All_Method {
	public static void main(String[] args) {
Stack<Integer> stacks = new Stack<Integer>();
		
		//To add an element to the top of the stack, we use the push() method
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		System.out.println(stacks);//op:-[1,2,3,4]
		
		//pop()
		
		stacks.pop();
		System.out.println(stacks);//op:-[1, 2, 3]
		
		
		//peek() method return the peek value of stack
		Integer result = stacks.peek();
		System.out.println(result); //op:-3
		
		
		Integer value = stacks.search(2);
		System.out.println(value);//op:-position 2
		
		//To check whether a stack is empty or not, we use the empty();
		boolean empty = stacks.isEmpty();
		System.out.println(empty);//op:-false
		
	}

}
