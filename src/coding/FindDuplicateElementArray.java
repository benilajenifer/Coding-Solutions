package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementArray {

	public static void main(String[] args) {

		String names[] = { "java", "python", "c", "java", "ruby", "python" };
//second best solution with o(n)
		Set<String> hs = new HashSet<String>();

		for (String ele : names) {
			if (hs.add(ele) == false) {
				System.out.println("The duplicate Elements are:" + ele);
			}
		}
		System.out.println(hs);
//Worst Solution with Time complexity o(n^2)
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("The duplicate Element is:" + names[i]);
				}

			}
		}

//First best solution o(2n)

		Map<String, Integer> mapstore = new HashMap<String, Integer>();

		for (String el : names) {
			Integer count = mapstore.get(names);
			if (count == null) {
				mapstore.put(el, 1);
			} else {
				mapstore.put(el, ++count);
			}
		}
		// Getting the values form the hashmap
		Set<Entry<String, Integer>> entryset = mapstore.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("The duplicate element is:" + entry.getKey());
			}
		}

	}

}
