  abstract class demo {

	public static void main(String[] args) {
		
		demo d= new A();
		d.addu();

	}
	
	public void add(){
		

}
	abstract void addu();
}

 class A extends demo{

	@Override
	 public void addu() {
		System.out.println("add");
		
	}
	
}

