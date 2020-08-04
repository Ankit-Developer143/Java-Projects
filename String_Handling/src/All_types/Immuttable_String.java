package All_types;

public class Immuttable_String {
	public static void main(String[] args) {
		String s = "Sachin";
		/*
		 * As you can see in the above figure that two objects are created but s
		 * reference variable still refers to "Sachin" not to "Sachin Tendulkar". But if
		 * we explicitely assign it to the reference variable, it will refer to
		 * "Sachin Tendulkar" object.For example:
		 */
		// String result = s.concat("ankit");
		// System.out.println(result);

		// Immutable
		s.concat("Ankit");
		System.out.println(s);
		// op:-Sachin
	}

}
