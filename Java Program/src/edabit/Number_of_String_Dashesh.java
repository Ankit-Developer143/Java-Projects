package edabit;

public class Number_of_String_Dashesh {
	String result = "";

	public String go(int num) {
		for (int i = 0; i < num; i++) {
			result += "-";
		}
		return result;
	}

	public static void main(String[] args) {
		Number_of_String_Dashesh n = new Number_of_String_Dashesh();
		System.out.println(n.go(5));

	}

}
