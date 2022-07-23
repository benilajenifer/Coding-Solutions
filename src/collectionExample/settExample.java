package collectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class settExample {

	public static void main(String[] args) {
		
		//HashSet<Integer>hs=new HashSet<>();
		Set<Integer>hs=new HashSet<>();
		hs.add(9);
		hs.add(8);
		hs.add(4);
		
		//System.out.println(hs);
		
//		for(int a:hs) {
//			System.out.println(a);
//		}
		
		Iterator i=hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
