package coding;

public class PalindromString {

	public static void main(String[] args) {
		String s = "tempo";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(s)) {
			System.out.println("its a palindrom String");

		} else {
			System.out.println("Not a palindrom string");
		}

	}

}
