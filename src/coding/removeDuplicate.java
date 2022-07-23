package coding;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
		String s = "Programming";

		// approcah1

		StringBuilder sb = new StringBuilder();
		s.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);
		// approach 2
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char v = s.charAt(i);
			int idx = s.indexOf(v, i + 1);
			if (idx == -1) {
				sb1.append(v);
			}
		}
		System.out.println(sb1);
//approach s
		StringBuilder sb2 = new StringBuilder();
		char c[] = s.toCharArray();
//programming
		for (int i = 0; i < c.length; i++) {
			Boolean repeat = false;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					repeat = true;
					break;
				}

			}
			if (!repeat) {
				sb2.append(c[i]);
			}
		}
		System.out.println(sb2);
		String s1 = "programming";
		StringBuilder sb4 = new StringBuilder();

		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for(Character c1:set) {
			sb4.append(c1);
			
		}
		System.out.println(sb4);

	}

	// approach4

}
