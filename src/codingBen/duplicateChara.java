package codingBen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateChara {

	public static void main(String[] args) {

		String s = "Java";
		char[] c = s.toCharArray();

		HashSet<Character> hs = new HashSet<Character>();

		for (Character ele : c) {

			if (hs.add(ele) == false) {
				System.out.println("The dupicate element is:" + ele);
			}
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character ele1 : c) {

			Integer count = hm.get(ele1);
			if (count == null) {
				hm.put(ele1, 1);
			} else {
				hm.put(ele1, ++count);
			}
		}

		Set<Entry<Character, Integer>> se = hm.entrySet();

		for (Entry<Character, Integer> ele2 : se) {
			if (ele2.getValue() > 1) {
				System.out.println(ele2.getKey() + ":" + ele2.getValue());
			}
		}

	}

}
