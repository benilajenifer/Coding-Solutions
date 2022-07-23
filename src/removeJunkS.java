
public class removeJunkS {

	public static void main(String[] args) {

		String s = "###BenJen%%%%";// string literal-string pool
		String s1 = new String("$$$jenben***");//
		 s1.replaceAll("[^a-zA-z-0-9]", "");
		
		// string object--heap
		s.replaceAll("[^a-zA-z-0-9]", "");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("$$$jenben***");
		sb.reverse();
		System.out.println(sb);
	
		
		
		
		

}
}
