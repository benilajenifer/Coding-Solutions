
 interface DemoEx {
	public void add() ;
	
	 public int str=9;
	
}
 
 class B implements DemoEx{
	 public void add() {
		 System.out.println("add");
	 }
	 
 }

 class C {
	 public static void main(String[] args) {
		 DemoEx x=new B();
		 
	 }
 }