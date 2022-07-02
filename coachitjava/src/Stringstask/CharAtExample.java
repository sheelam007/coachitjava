package Stringstask;

public class CharAtExample {

	public static void main(String[] args) {
		String str="welcome to coachit";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='t') {
				count++;
			}	
		}
		System.out.println("Counting of t is:"+count);
	}
}
