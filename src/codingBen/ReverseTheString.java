package codingBen;

public class ReverseTheString {

	public static void main(String args[]) {
		String s = "Selenium";
		int len = s.length();
		String rev = "";

		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		for (int i = len - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("the reversed string is:" + rev);

	}
	
	
	
}