package edabit;

public class oddEven {
		 public static String isEvenOrOdd(int num) {
				if(num%2 == 0){
					return "evan";
				}else {
				return "odd";
		 }
		 }
	public static void main(String[] args) {
		oddEven o = new oddEven();
		System.out.println(o.isEvenOrOdd(146));
		
		
		
	}

}
