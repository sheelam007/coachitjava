package Javatest;

public class OverridingExample {
     class p{
    	 void marry(){
    	 System.out.println("Parrent dession");
     }
     class c extends p{
    	 void marry(){
    	 System.out.println("childerns dession");
     }
   

	public static void main(String[] args) {
		p p1=new p();
		 p1.marry();
		 c c1=new c();
		 c1.marry();
		 p p2=new p();
		 p2.marry();
	     }
     }
     }
     }
     
     