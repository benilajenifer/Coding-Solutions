package codingBen;

public class SwappingWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 90;
		int y = 70;

		int temp = x;
		x = y;
		y = temp;
		System.out.println(x);
		System.out.println(y);

		// Swapping without temp;

		x = x + y;// 90+70=160
		y = x - y;// 160-70 90
		x = x - y;// 160-90 70

		System.out.println(x);
		System.out.println(y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println(x);
		System.out.println(y);
		
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
	

	}

}
