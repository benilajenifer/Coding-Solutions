package coding;

import java.util.HashMap;
import java.util.Set;

public class frequencyOfDigits {

	public static void main(String[] args) {
		Integer n = 776888;

		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();

		while (n != 0) {
			long lastdigit = n % 10;

			if (hm.containsKey(lastdigit)) {
				hm.put(lastdigit, hm.get(lastdigit) + 1);
			} else {

				hm.put(lastdigit, 1);
			}
			n=n/10;

		}
		System.out.println(hm);
		

		Set<Long> s = hm.keySet();
		
		for(Long keys:s) {
			
			System.out.println(keys+":"+hm.get(keys));
		}
	}

}
