package codingBen;

public class SwappStringWithoutTemp {

	public static void main(String[] args) {

		String a = "Jen";
		String b = "hello";
		a = a + b;// jenben//append
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
//		b = a.substring(0, a.length() - b.length());// Jen
//		a = a.substring(b.length());

		System.out.println("###############After Swapping##############33");
		System.out.println(a);
		System.out.println(b);

	}

}
