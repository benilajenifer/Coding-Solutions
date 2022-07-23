package codingBen;

public class largestNum {

	public static void main(String[] args) {

		int num1 = 90;
		int num2 = 100;

		int max = (num1 > num2) ? num1 : num2;
		System.out.println(max);

		int max1 = Math.max(num1, num2);
		System.out.println(max1);
		
		if(num1>num2) {
			
			System.out.println("The max is:"+num1);
		}
		
		else {
			System.out.println("The max is:"+num2);
		}

	}

}
