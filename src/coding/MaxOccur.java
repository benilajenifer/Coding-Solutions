package coding;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccur {

	public static void main(String[] args) {
		String s = "choota";
		char[] c = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character ele : c) {
			Integer count = hm.get(ele);
			if (count == null) {
				hm.put(ele, 1);
			} else {
				hm.put(ele, ++count);
			}

		}
		Set<Entry<Character, Integer>> es = hm.entrySet();
		
		for(Entry<Character, Integer> ele1:es) {
			if(ele1.getValue()>1) {
				System.out.println("the maximum occuring elenent is: "+ele1.getKey());
			}
		}

	}

}
