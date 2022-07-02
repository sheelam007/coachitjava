package threads;

public class Mythread extends Thread{
    public void run() {
    	for(int i=0; i<10; i++) {
    		System.out.println("child thread");
    	}
   }
	public static void main(String[] args) {
		 Mythread t=new Mythread();//Instantiation of a Thread
		    t.start();//starting of a Thread
		    for(int i=0;i<5;i++)
		    {
		    System.out.println("main thread");
		       }
	}

}