package Javatest;

public class SeparateZerosandNonzeros {

	public static void main(String[] args) {
		int a[]= {1,0,3,0,5,6};
	    int count=0;
	    System.out.println( "1,0,3,0,5,6");
	    for(int i=0; i<a.length;i++) {
	    	if(a[i]!=0) {
	    		a[count]=a[i];
	    		count++;
	    	}
	    }
	    while(count<a.length) {
    		a[count]=0;
    		count++;
    	}
       
    for(int i=0; i<a.length; i++) {
    	 System.out.print(" "+a[i]);
     }
   
	}
}