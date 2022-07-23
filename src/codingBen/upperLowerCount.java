package codingBen;

public class upperLowerCount {

	public static void main(String[] args) {
		
		String s="Welcome To Automation";
		
//		int upper=0;
//		int lower=0;
//		
//		for(int i=0;i<s.length();i++) {
//		char c=	s.charAt(i);
//		if(c>=65 && c<=90) {
//			upper++;
//		}
//		else {
//			lower++;
//		}
//		}
//		
//		System.out.println(upper);
//		System.out.println(lower);
		
		String Upper="";
		String Lower="";
		
		for(int i=0;i<s.length();i++)
		{
		char c=	s.charAt(i);
		
		if(c>=65 && c>=90) {
			Upper=Upper+c;
		}
		else {
			Lower=Lower+c;
		}
		}
		
	System.out.println(Upper);	
	
	System.out.println(Lower);

	}

}
