package coachitexceptions;

public class ExceptionTest {

	public static void main(String[] args) {
	{
		System.out.println("this is a exception class");
		try {
	    System.out.println(10/0);
	    }catch(ArithmeticException e){
	    	e.printStackTrace();
	    	//System.out.println(e.toString());
	    	//System.out.println(e.getMessage());
	    }
		System.out.println("hi");
	}
}
}
	
