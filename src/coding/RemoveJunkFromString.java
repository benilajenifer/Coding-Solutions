package coding;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		String s = "###Ben%%Jen###***Hello";

		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
