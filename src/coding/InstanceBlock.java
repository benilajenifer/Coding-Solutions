package coding;

public class InstanceBlock {
	
	{
		System.out.println("Block");
	}
	InstanceBlock(){
		System.out.println("constructor");
	}
	

	public static void main(String[] args) {
		InstanceBlock is=new InstanceBlock();
		System.out.println("main");

	}

}
