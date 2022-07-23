package coding;

public class ReverseTheString {

	public static void main(String[] args) {
		String s = "jeniferBenila";

		System.out.println(s.length());

		String rev = "";
//method 1:using for loop
		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
//method 2:Using String Buffer class
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		System.out.println(sb);
	}

}
