package coding;

public class replaceCharWithOccurance {

	public static void main(String[] args) {
		String s = "Selenium";
		char tobereplace = 'e';

		if (s.indexOf(tobereplace) == -1) {
			System.out.println("the given char doesnt presesnt");
		}

		char[] d = s.toCharArray();
		int cnt = 1;

		for (int i = 0; i < d.length; i++) {

			if (d[i] == tobereplace) {
				String input = s.replaceFirst(String.valueOf(tobereplace), String.valueOf(cnt));

				cnt++;

			}

		}
		int cnte = 1;
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == tobereplace) {
				 s = s.replaceFirst(String.valueOf(tobereplace), String.valueOf(cnte));
				cnte++;
			}
			
		}
		System.out.println(s);
	}

}
