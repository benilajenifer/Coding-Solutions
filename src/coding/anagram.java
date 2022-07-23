package coding;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("Triangle", "INTEGRAL"));
	}

	public static Boolean isAnagram(String s, String s1) {
		if (s.length() != s1.length()) {
			return false;
		}

		char[] c = s.toLowerCase().toCharArray();
		char[] c1 = s1.toLowerCase().toCharArray();

		Arrays.sort(c);
		Arrays.sort(c1);

		return Arrays.equals(c, c1);

	}

}
