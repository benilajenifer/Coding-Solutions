package coding;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "J E N ";
		String s1 = s.trim();
		System.out.println(s1);

		String s2 = s1.replaceAll("\\s+", "");
		System.out.println(s2);

//		String nowhite = "";
//
//		for (int i = 0; i < s1.length(); i++) {
//
//			if ((s1.charAt(i) != ' ') && (s1.charAt(i) != '\t')) {
//				nowhite = nowhite + s1.charAt(i);
//
//			}
//		}

		//System.out.println(nowhite);

		char[] c = s1.toCharArray();
		
		String neString="";
		
		for(int i=0;i<s1.length();i++) {
			if((c[i]!=' ') && (c[i]!='\t')) {
				neString=neString+c[i]	;
			}
			
		}
		System.out.println(neString);
	}

}
