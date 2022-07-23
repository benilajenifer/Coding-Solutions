package coding;

public class MissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 8, 7, 4, 5 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		int a1[] = { 1, 2, 3, 4, 5 };

		int sum1 = 0;
		for (int j = 0; j < a1.length; j++) {
			sum1 = sum1 + a1[j];
		}
		System.out.println(sum1);

		int res = sum1 - sum;
		System.out.println("The missing number is:" + res);
	}

}
