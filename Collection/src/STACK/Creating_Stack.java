package STACK;

import java.util.Stack;

/*LAST IN FIRST OUT*/

public class Creating_Stack {
	public static void main(String[] args) {

//Create Integer type stack
		Stack<Integer> stacks = new Stack<>();

//add Element using Push Methods
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		System.out.println(stacks);
	}

}
