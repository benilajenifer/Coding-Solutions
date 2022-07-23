package codingBen;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateEle {

	public static void main(String[] args) {
		
		String []sr= {"Java","Ruby","Python","Java"};
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		
		for(String ele:sr) {
		Integer count=	hm.get(ele);
		
		if(count==null) {
			hm.put(ele, 1);
		}else {
			hm.put(ele, ++count);
		}
		}
		
	Set<Entry<String,Integer>>se=hm.entrySet();
	for(Entry<String,Integer> ele1:se) {
		
		if(ele1.getValue()>1) {
			System.out.println("the duplicate element is:"+ele1.getKey()+" :"+ele1.getValue());
		}
	}
		

	}

}
