package logics;

public class PatternAtoFlogic {

	public static void main(String[] args) {
		char c[]= {'A','B','C','D','E','F'};
		for(char i=1; i<=c.length; i++) {
			
			for(char j=1; j<=i; j++) {
				
			   System.out.print(c[j-1]);
			}
			   System.out.println();
		}

	}

}
