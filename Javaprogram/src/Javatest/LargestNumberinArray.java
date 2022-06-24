package Javatest;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int Array[]= {10, 5, -15, 20, -30};
	    int	large=Array[0];
	    int small=Array[0];
	    for(int i=1; i<Array.length; i++)
	    {
	    	if(Array[i]>large)
	    	{
	    		large=Array[i];
	    	}
		}
	    System.out.println("Largest Element:"+large);
	   // System.out.println(small);  
	}
}
      