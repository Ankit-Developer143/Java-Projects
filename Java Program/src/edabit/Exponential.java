package edabit;

public class Exponential {
	public static int kToK(int n, int k) {
		int result = (int) Math.pow(k, n);
		return result;
	}

	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.kToK(4, 2));// 16 =4x4
	}

}
