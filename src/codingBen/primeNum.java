package codingBen;

public class primeNum {

	public static void main(String[] args) {
		Boolean status = isprimeNuber(97);
		System.out.println(status);

	}

	public static Boolean isprimeNuber(int num) {

		// edge test cases

		// 1.First we need to check for less than 2,because first prime number is 2
		if (num < 2) {
			return false;
		}
//starting the loop from 2 and dividing all the number tll the given 
		// num by i and checking the reminder if number is giving reminder false
		else
		{
		for (int i = 2; i <num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		}
		return true;

	}

}
