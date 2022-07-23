package coding;

import java.util.Arrays;

public class sortAlphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "benila";
//approach 1
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];// j
					arr[i] = arr[j];// e
					arr[j] = temp;//
				}
			}
		}
		System.out.println(new String(arr));
		String s1 = "Benila";
		char[] a = s1.toCharArray();

		Arrays.sort(a);
		
		System.out.println(new String(a));
	}

}
