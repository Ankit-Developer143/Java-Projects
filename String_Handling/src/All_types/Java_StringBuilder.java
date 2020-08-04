package All_types;

/*Java StringBuilder class is used to create mutable (modifiable) string.
=> The Java StringBuilder class is same as StringBuffer class except 
=>that it is non-synchronized.
=> It is available since JDK 1.5.*/
public class Java_StringBuilder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("b");
		s.append(" a");
		System.out.println(s);
		//op:-b a
		
		//String insert()
		s.insert(1, " c");
		System.out.println("Insert Values : "+s);
		//op:-Insert Values : b c a
		
		
		
		
		
		//Similar as a String Buffer But its Non - Synchronised.
	}

}
