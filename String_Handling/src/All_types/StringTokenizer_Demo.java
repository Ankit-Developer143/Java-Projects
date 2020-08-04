package All_types;

import java.util.StringTokenizer;

/*The java.util.StringTokenizer class allows you to break a string into tokens.
 * =>  It is simple way to break string.

It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc
*/
public class StringTokenizer_Demo {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("My Name Is Ankit Singh");
		while(s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}
		
	}
	/*
	 * op:=> My 
	 * Name 
	 * Is 
	 * Ankit 
	 * Singh
	 */

}
