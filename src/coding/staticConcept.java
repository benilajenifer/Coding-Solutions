package coding;

public class staticConcept {
	
	static {
		System.out.println("Block1");
	}
	static {
		System.out.println("Block2");
	}
	static {
		System.out.println("Block3");
	}
	public static void main(String[] args) {
		System.out.println("main metjod");
		withOutMain wm=new withOutMain();
		
		
	}
	
	static {
		System.out.println("Block4");
	}

}
