package codingBen;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,90,-2,-1};

int largest=arr[0];
int smallest=arr[0];

for(int i=1;i<arr.length;i++) {
	if(arr[i]>largest) {
		largest=arr[i];
	} else if (arr[i] < smallest) {
		smallest = arr[i];
	}
	
}
System.out.println("The largest value is:"+largest);
System.out.println("The largest value is:"+smallest);
		
	}

}
