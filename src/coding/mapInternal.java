package coding;

import java.util.HashMap;

public class mapInternal {
	public static void main(String[]args) {
		
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		
		hm.put("Benila", 100);
		hm.put("Jenifer", 200);
		hm.put("tom", 300);
		hm.put("jerry", 400);
		hm.put(null, 500);
		hm.put("ti", 600);
		hm.put("Tyue", 700);
		hm.put(null, null);
		hm.put(null, null);
		System.out.println(hm);
		
		hm.get("naveen");
		hm.get("Jenifer");
		
	}

}
