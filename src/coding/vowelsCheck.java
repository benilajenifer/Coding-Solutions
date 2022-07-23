package coding;

public class vowelsCheck {

	public static void main(String[] args) {
		getVowelsCont("Welcome", 'o');
		getCountVowels("WelcSeleniumome",'e');
	}

	
	public static void getVowelsCont(String s, char val) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				count++;

			}

		}
		System.out.println(val + ":" + count);

	}

	public static void getCountVowels(String s, char val) {
		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			
			if(c[i]==val) {
				count++;
			}
		}System.out.println(val + ":" + count);
	}
	
	public static void getCharOccuranceCount() {
		
	}
}
