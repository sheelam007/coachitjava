package Stringexamples;

public class ReverseStringExamples {
          
	public static void main(String[] args) {
	    String s="hello all";
	    String sum="";
	    char ch[]=s.toCharArray();
	    for(int i=ch.length-1; i>=0; i--) {
	    	sum=sum+ch[i];
	    }
	    System.out.println(sum);
	}
}
