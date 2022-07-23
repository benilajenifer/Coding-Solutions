package coding;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int num = 23;

		int revnum = 0;

		while (num != 0) {
			revnum = revnum * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(revnum);
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());;
		
	}

}
