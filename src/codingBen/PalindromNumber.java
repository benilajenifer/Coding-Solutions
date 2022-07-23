package codingBen;

public class PalindromNumber {

	public static void main(String[] args) {

		int n = 132;
		int temp=n;

		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;//89
			n = n / 10;//89
		}
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("The given number is a palindrom");
		}
			else {
				System.out.println("the given number is not a palindrom");
			}
		}

	}


