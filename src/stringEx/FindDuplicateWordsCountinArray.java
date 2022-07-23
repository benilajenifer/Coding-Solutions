package stringEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWordsCountinArray {

	public static void main(String[] args) {
		String s = "jen ben hi hello jen ben hello";

		String words[] = s.split(" ");
		
		Map<String,Integer>mapstore=new HashMap<String,Integer>();
		
		for(String ele :words) {
			if(mapstore.containsKey(ele)) {
				mapstore.put(ele,mapstore.get(ele)+1);
			}else {
				mapstore.put(ele, 1);
			}
		}
		System.out.println(mapstore);
		
	Set<String>ky=	mapstore.keySet();
		
	for(String el:ky) {
		if(mapstore.get(el)>1) {
			System.out.println(el +" : "+mapstore.get(el));
		}
	}
		

	}

}
