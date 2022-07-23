package codingBen;

public class palindromNumber1 {
	public static void main(String[] args) {

		String check = palidromNumber(135);
		System.out.println(check);

	}

	public static String palidromNumber(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		if (temp == rev) {
			return "Palindrom Number";
		} else {
			return "Not a Palindrom Number";
		}

	}

}