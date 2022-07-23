package codingBen;

public class ArmstrngNumber {

	public static void main(String[] args) {
		armstrongNumber(144);
	}

	public static void armstrongNumber(int num) {
		int temp = num;
		int cube = 0;
		while (num != 0) {

			int r = num % 10;// 3
			num = num / 10;// 15
			cube = cube + r * r * r;

		}
		if (cube == temp) {
			
			System.out.println("Armstrong Number");

		}else {
			System.out.println("Not an Armstrong Number");
		}

	}
}
