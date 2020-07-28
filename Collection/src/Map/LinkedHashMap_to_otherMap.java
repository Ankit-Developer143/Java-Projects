package Map;
//Accept Null Values
//Accept duplicate Value and print only once
import java.util.LinkedHashMap;

public class LinkedHashMap_to_otherMap {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l = new LinkedHashMap<>();
	//l.put(null, null);
	l.put("Ankit", 1);
	l.put("Ram", 2);

	
	
	LinkedHashMap<String,Integer> h = new LinkedHashMap<>(l);
	h.put("Devdas" , 3);
	h.put("Vikas" , 4);
	
	System.out.println(h.entrySet());
	
	//putIfAbsent() null or Key return
	System.out.println("aknowledge the Value :" + h.putIfAbsent("Ankit",2));
	
	System.out.println("Combine Output :" +h);
	
	//return value
	System.out.println("get Method :" +h.get("Ankit"));
	
	
	//[Ankit=1, Ram=2, Devdas=3, Vikas=4]
	//op:-aknowledge the Value :1
	//Combine Output :{Ankit=1, Ram=2, Devdas=3, Vikas=4}

}



}
