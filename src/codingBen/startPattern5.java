package codingBen;

public class startPattern5 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 3; j >i; j--) {

				System.out.print(" ");

			}

			for (int g = 0; g <= i; g++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
