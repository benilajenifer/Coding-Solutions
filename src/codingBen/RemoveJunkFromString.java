package codingBen;

public class RemoveJunkFromString {

	public static void main(String args[]) {
		
		String s="@#$%Hen$$$Nem";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The fesh String is :"+s1);
	}
}
