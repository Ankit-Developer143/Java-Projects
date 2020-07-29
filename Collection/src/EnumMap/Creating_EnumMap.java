package EnumMap;

import java.util.EnumMap;

public class Creating_EnumMap {
	enum Size{
		SMALL , LARGE, MEDIUM;
	}
	public static void main(String[] args) {
		EnumMap<Size,Integer> obj = new EnumMap<>(Size.class);
		obj.put(Size.SMALL,1);
		obj.put(Size.MEDIUM, 2);
		obj.put(Size.LARGE, 3);
		System.out.println(obj);
		//op:-{SMALL=1, LARGE=3, MEDIUM=2}
		
		
		//entrySet() - returns a set of all the keys/values mapping (entry) of an enum map
		System.out.println(obj.entrySet());
		
		
		//Using the get merhod
		int value = obj.get(Size.MEDIUM);
		System.out.println("Value of Medium "+ value);
		//op:-Value of Medium 2
		
		
		//removed
		boolean result = obj.remove(Size.LARGE,3);
		System.out.println("Removed : "+result);
		//op:-Removed : true
		
		//replace
		obj.replace(Size.MEDIUM, 4);
		System.out.println("replaced :"+ obj);
		//op:-replaced :{SMALL=1, MEDIUM=4}		obj.replace(Size.SMALL, 1, 8);
		System.out.println("Replace old value with new : "+obj);
		//Replace old value with new : {SMALL=8, MEDIUM=4}
		
	}

}
