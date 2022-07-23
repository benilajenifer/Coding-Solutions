package codingBen;

public class ReverseTheNumber {
	public static void main(String args[])
	{
		int n=5678;
		
		StringBuffer sb=new StringBuffer(String.valueOf(n)).reverse();
		System.out.print(sb);
		int rev=0;
		 while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		 }
		 
		 System.out.println("The reversed number is :"+rev);
	}
}
