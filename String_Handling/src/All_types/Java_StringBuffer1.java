package All_types;

public class Java_StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ankit");
		sb.append(" Solanki");
		System.out.println("Print Value : "+sb);
		//op:-Print Value : Ankit Solanki
		
		
		
		//StringBuffer insert() method
		
		sb.insert(5, " Singh");
		System.out.println("Insert The Values :" +sb);
		//op:-Insert The Values :Ankit Singh Solanki
		
		
		
	}

}
