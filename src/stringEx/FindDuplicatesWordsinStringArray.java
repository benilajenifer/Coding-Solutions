package stringEx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesWordsinStringArray {
	public static void main(String[] args) {

		String names[] = { "java", "python", "c", "java", "ruby", "python" };

		// using hashmap:

		Map<String, Integer> mapstore = new HashMap<String, Integer>();

		for (String ele : names) {

			Integer count = mapstore.get(ele);
			if (count == null) {

				mapstore.put(ele, 1);

			} else {
				mapstore.put(ele, ++count);
			}

		}
		System.out.println(mapstore);
//entry set returns key and value pair
		//key set returns only keys
		Set<Entry<String, Integer>> entryset = mapstore.entrySet();
		for (Entry<String, Integer> ety : entryset) {
			if (ety.getValue() > 1) {
				System.out.println(ety.getKey()+" : "+ety.getValue() );
			}
		}
		
		Set<String>hs=new HashSet<String>();
		for(String ele:names) {
			if(hs.add(ele)==false) {
				System.out.println("The duplicate element is:"+ele);
			}
		}
		
		
	}

}
