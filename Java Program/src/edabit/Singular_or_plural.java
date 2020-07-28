package edabit;

public class Singular_or_plural {
	public static boolean isPlural(String word) {
		if (word.endsWith("s")) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Singular_or_plural s = new Singular_or_plural();
		System.out.println(s.isPlural("persons"));

	}

}//true
