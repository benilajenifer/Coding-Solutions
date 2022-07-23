package coding;

public class staticConcept3 {
	
	static int age;
	
	private staticConcept3(){
		age=30;
	}
	
	
	public static int createObject()
	{
		staticConcept3 s=new staticConcept3();
		s.age=40;
		return age;
	}

	

}