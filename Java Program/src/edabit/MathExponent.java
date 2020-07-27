package edabit;

public class MathExponent {
	public static int calculateExponent(int num, int exp) {
		return (int) Math.pow(num, exp);

	}

	public static void main(String[] args) {
		MathExponent m = new MathExponent();
		System.out.println(m.calculateExponent(5, 5));

	}

}
