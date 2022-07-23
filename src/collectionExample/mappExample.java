package collectionExample;

import java.util.HashMap;

public class mappExample {

	public static void main(String[] args) {
		
		HashMap<String,String> ma=new HashMap<String,String>();
		ma.put("name", "jenkutty");
		ma.put("place", "US");
		ma.put("sal", "500USD");
		
		
		for(String k:ma.keySet()) {
			System.out.println(k);
			
		}
		
		for(String v:ma.values()) {
			System.out.println(v);
		}
		
		for(String k:ma.keySet()) {
			System.out.println(k+":"+ma.get(k));
		}
				

	}

}

