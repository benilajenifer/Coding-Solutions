package coding;

public class firstNonRepeating {

	public static void main(String[] args) {
		
		
		String s="cDDDd";
		
		for(int i=0;i<s.length();i++) {
			boolean repeat=true;
			for(int j=0;j<s.length();j++) {
				if( i!=j && s.charAt(i)==s.charAt(j)) {
					repeat=false;
					
				}
				}
				if(repeat) {
					System.out.println(s.charAt(i));
					break;
				}
			}
			
		}

	}


