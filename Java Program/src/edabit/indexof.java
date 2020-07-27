package edabit;

public class indexof {
	 public static int search(int[] arr, int item) {
		 int result = 0;
		 for (int i = 0; i < arr.length; i++) {
			
			  if(arr[i] == item) {
				  return i;
			  }
			 
		 }
		return -1;
			
	  }
	public static void main(String[] args) {
		int arr[] = {1, 2,5, 3};
		
		indexof  o = new indexof ();
		System.out.println(o.search(arr, 2));
		
		
	}

}
