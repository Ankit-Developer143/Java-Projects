package edabit;

public class LeapYear {

	public static boolean isLeap(int year) {
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public static void main(String[] args) {
		LeapYear l = new LeapYear();
		System.out.println(l.isLeap(2020));

	}

}
