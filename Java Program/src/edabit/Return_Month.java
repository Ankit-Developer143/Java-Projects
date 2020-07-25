package edabit;

import java.util.Scanner;

public class Return_Month {
	public static String monthName(int num) {
		String result = "";
		switch (num) {
		case 1:
			result += "January ";
			break;
		case 2:
			result += "february ";
			break;
		case 3:
			result += "March";
			break;
		case 4:
			result += "April";
			break;
		case 5:
			result += "May";
			break;
		case 6:
			result += "June ";
			break;
		case 7:
			result += "July ";
			break;
		case 8:
			result += "August ";
			break;
		case 9:
			result += "Sepetember";
			break;
		case 10:
			result += "October";
			break;
		case 11:
			result += "November";
			break;
		case 12:
			result += "December";
			break;
			default:
				return null;

		}
		return result;

	}

	public static void main(String[] args) {
		Return_Month r = new Return_Month();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Month Number");
		int n = sc.nextInt();
		System.out.println(r.monthName(n));

	}

}
