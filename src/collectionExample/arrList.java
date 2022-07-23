package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class arrList {

	public static void main(String[] args) {
	
		
		//ArrayList<Integer>ar=new ArrayList<>();
		List<Integer>ar=new ArrayList<>();
		ar.add(9);
		ar.add(4);
		ar.add(7);
		ar.add(5);
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
 for(int a:ar)
 {
	 System.out.println(a);
 }
	}

}
