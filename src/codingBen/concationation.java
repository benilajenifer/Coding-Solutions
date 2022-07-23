package codingBen;

public class concationation {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "PQR";

		String str4 = str1 + str2 + str3;

		System.out.println(str4);

		// second way

		String nS = str1.concat(str2).concat(str3);

		
		System.out.println(nS);

	}

}
