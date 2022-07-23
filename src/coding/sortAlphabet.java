package coding;

public class sortAlphabet {

	public static void main(String[] args) {

		String s = "benila";

		char[] c = s.toCharArray();
		char temp;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}
			}
		}
System.out.println(new String(c));
	}

}
