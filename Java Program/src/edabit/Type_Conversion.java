package edabit;

public class Type_Conversion {
public static int toInt(String str) {
	int number = Integer.parseInt(str);
		
	return number;
	}

	public static String toStr(int num) {
		String value = Integer.toString(num);
		return value;
	
	
	}
	public static void main(String[] args) {
		
		Type_Conversion obj = new Type_Conversion();
		System.out.println(obj.toInt("10"));
		System.out.println(obj.toStr(10));
	}

}
