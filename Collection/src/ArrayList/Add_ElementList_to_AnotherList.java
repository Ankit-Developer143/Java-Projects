package ArrayList;

import java.util.ArrayList;

public class Add_ElementList_to_AnotherList {

	public static void main(String[] args) {
		ArrayList<Integer> Value = new ArrayList<Integer>();
		Value.add(1);
		Value.add(2);
		Value.add(3);
		Value.add(4);
		System.out.println(Value);//op:[1,2,3,4]
		
		
		
		
		ArrayList<Integer> Val = new ArrayList<Integer>();
		Val.add(5);
		Val.add(6);
		System.out.println(Val);//op:-[5,6]
		
			Val.addAll(Value);
		
		System.out.println(Value);//op:-[5, 6, 1, 2, 3, 4]	
		
		
	}

}