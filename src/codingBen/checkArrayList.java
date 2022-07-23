package codingBen;

import java.util.ArrayList;
import java.util.List;

public class checkArrayList {

	public static void main(String[] args) {

		List<Character> li = new ArrayList<Character>();
		char userasked = 'k';
		li.add('o');
		li.add('i');
		li.add('p');
		li.add('j');
		li.add('b');
//		System.out.println(li);
//		if (li.contains('i')) {
//			System.out.println("list has ele");
//		} else {
//			System.out.println("list dont have ele");
//		}

		for (Character c : li) {
			if (c == userasked) {
				System.out.println("list has ele");
			} else {
				System.out.println("list dont have");
			}
		}
	}
}
