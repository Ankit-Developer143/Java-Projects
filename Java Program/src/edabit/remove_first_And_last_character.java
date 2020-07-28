package edabit;

public class remove_first_And_last_character {
public static String removeFirstLast(String str) {
	if(str.length()<=2) {
		return str;
	
	}
	String result = str.substring(1, str.length()-1);
	return result;
	
}
	public static void main(String[] args) {
		remove_first_And_last_character r =new remove_first_And_last_character();
		System.out.println(r.removeFirstLast("hello"));
	}

}
//ell
