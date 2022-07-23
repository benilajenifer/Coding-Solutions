package codingBen;

public class removeWhiteSpace
{
	public static void main(String[] args)
	{
		//one method
		String s=" j e n i f e r ";
		
		String s1=s.replaceAll("\\s+", "s");
		
		System.out.println(s1);
		
		//using char array
		
		char[] c=s.toCharArray();
        StringBuffer sb=new StringBuffer();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' '){
				sb.append(c[i]);
			}
			
		
		}
		System.out.println(sb);
		
		//using CharAt
		StringBuffer sb1=new StringBuffer();
		for(int j=0;j<s.length();j++)
	{
		if (s.charAt(j)!=' ')
		{
			sb1.append(s.charAt(j));
	
		}
			
	}
		
		System.out.println(sb1);	
		
	}
	

}
