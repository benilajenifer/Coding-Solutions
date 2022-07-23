package coding;

public class replaceWithOccurance {

	public static void main(String[] args) {

		String s = "Jenifer";

		char tobeReplace = 'e';

		char[] c = s.toCharArray();
		int count = 1;

		for (int i = 0; i < c.length; i++) {

			if (c[i] == tobeReplace) {

				s = s.replaceFirst(String.valueOf(tobeReplace), String.valueOf(count));
				count++;

			}

		}
		System.out.println(s);
	}

}
