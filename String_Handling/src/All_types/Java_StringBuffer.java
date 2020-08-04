package All_types;
//Java StringBuffer class is used to create mutable (modifiable) string. 
//The StringBuffer class in java is same as String class except it is mutable i.e.
//it can be changed.
//Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

//append
public class Java_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ramesh");
		sb.append(" Ankit");
		System.out.println(sb);//op:-Ramesh Ankit
		
		//replace
		sb.replace(3,6,"Naam" );
		System.out.println("Replace String :- "+sb);
		//op:-Replace String :- RamNaam Ankit
			
		
		//delete IndexValue
		sb.deleteCharAt(3);
		System.out.println("Delete Index Value :"+sb);
		//op:-Delete Index Value :Ramaam Ankit
		
		//delete 
		sb.delete(3,5 );
		System.out.println("Delete Value :"+sb);
		//op:-Delete Value :Ramm Ankit
		
		
		//reverse
		System.out.println(sb.reverse());
		//op:-tiknA mmaR
		
		//capacity formula (oldcapacity*2)+2 default oldcapacity is 16
		System.out.println("The Capacity is :-" +sb.capacity());
		//op:-The Capacity is :-22
		
		
		
		
		
		
	}

}
