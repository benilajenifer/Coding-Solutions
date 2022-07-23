package coding;

public class Palindromnumber {

	public static void main(String[] args) {

		int num = 12;

		int t = num;// 135

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (t == rev) {
			System.out.println("palindrom");

		} else {
			System.out.println("Not palindrom");
		}

	}
}