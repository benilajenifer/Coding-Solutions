package codingBen;

public class factorialOfNumber {

	public static void main(String[] args) {

		int factnum = findFactorial(6);
		System.out.println(factnum);

		int facto = factFind(6);
		System.out.println(facto);

	}

	public static int findFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int factFind(int num) {
		if (num == 0) {
			return 1;
		} else {
			
			return(num*factFind(num-1));
		}
	}

}
