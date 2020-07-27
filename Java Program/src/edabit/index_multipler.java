package edabit;

public class index_multipler {
	public static int indexMultiplier(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] * i;

		}

		return result;

	}

	public static void main(String[] args) {
		int arr[] = { -3, 0, 8, -6 };
		index_multipler m = new index_multipler();
		System.out.println(m.indexMultiplier(arr));

	}

}
//(-3*0 + 0*1 + 8*2 + -6*3) =-2
