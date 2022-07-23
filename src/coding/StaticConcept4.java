package coding;

public class StaticConcept4 {
	
	class Test{
		static {
			
			System.out.println("static bloc");
		}
		public static  final  int x=10;
	}

	public static void main(String[] args) {
		System.out.println(Test.x);//10 static block wont be executed.
		//Optimization will happen as the values will be in meta space before loading the class it will be printed
		
	}

}
