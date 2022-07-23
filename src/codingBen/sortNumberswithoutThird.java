package codingBen;

public class sortNumberswithoutThird
{

	public static void main(String[]args)
	{
		int a=10;int b=9;
		int temp;
		
		//Using temp variable
//		temp=a;//10
//		a=b;//9
//		b=temp;//10
		
		//without using third variable
		
		a=a+b;//10+9 19
		b=a-b;//19-9  10
		a=a-b;//19-10 9
		
		System.out.println(a);
		System.out.println(b);
		
		
		a=a*b; //10*9 90
		b=a/b; //90/9 10
		a=a/b; //90/10 9
		
		
		
	}
}
