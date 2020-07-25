package LIST;

import java.util.LinkedList;
import java.util.List;

/*Manipulation with LinkedList is faster than ArrayList because 
it uses a doubly linked list, so no bit shifting is required in memory.
*/
public class Implementing_LinkedList {
	public static void main(String[] args) {
		 List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");
		  
		  
		  System.out.println(al2);
		  //op:-[James, Serena, Swati, Junaid]
	}

}
