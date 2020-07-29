package EnumMap;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSet_allof_noneof {
	enum days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  ;
	}
	public static void main(String[] args) {
		
		//allOf
		EnumSet<days> n = EnumSet.allOf(days.class);
		System.out.println("All of :" +n);
		//op:-[SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
		
		//noneOf
		EnumSet<days> m = EnumSet.noneOf(days.class);
		System.out.println("None of : " +m);
		//op:- None of : []
	}

}
