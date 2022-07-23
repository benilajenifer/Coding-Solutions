package codingBen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String name[] = { "java", "python", "java", "ruby","ruby" };

		
			Set<String>hs=new HashSet<String>() ;
				
				for(String ele:name) {
					if(hs.add(ele)==false) {
						
					System.out.println("The duplicate ele is:"+ele);	
					}
				}
			
//hashSethsh

			

			Map<String, Integer> mapstore = new HashMap<String, Integer>();
			
			for (String ele1 : name) {
				Integer count = mapstore.get(ele1);
				
				if (count == null) {
					mapstore.put(ele1, 1);
				} else {
					mapstore.put(ele1, ++count);
				}
				
			}

			Set<Entry<String, Integer>> dg = mapstore.entrySet();
			System.out.println(dg);
			for(Entry<String, Integer>edl:dg) {
				if(edl.getValue()>1) {
					System.out.println("the duplicate ele:"+edl.getKey());
				}
			}

		}
	

	}


