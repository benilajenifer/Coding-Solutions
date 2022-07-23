
package coding;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 10, -1,9, -2 };

		int largest = a[0];//-1,4,7,9
		int smallest = a[0];//-1

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
				//System.out.println(a[i]);
			}
			else if(a[i]<smallest) {
				smallest = a[i];
				//System.out.println(a[i]);
			}
			}
		
		System.out.println("The largest number in the array is:"+largest);
		System.out.println("The smallest number in the array is:"+smallest);
	}

}
