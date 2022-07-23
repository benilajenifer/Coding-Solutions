package coding;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
	System.out.println(9/0);//aruthmetic exception
	}catch(Exception e) {
	e.printStackTrace();
	}
	
	System.out.println(9.0/0);
	System.out.println(2.33d/0);
	
	//System.out.println(9/0.0);
	
	System.out.println(0.0/0.0);
	System.out.println(0/0);//arithmetic exception
	
	//Arithmetic exception will come only with Integers not with double

	}

}
