package Stringstask;

public class VowelsCount {

	public static void main(String[] args) {
		String str="welcome to the javaworld";
		int vow_count=0;
		int con_count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vow_count ++;
				System.out.println(ch);
			}
			else if((ch!='a' && ch!='z')){
				con_count++;
				System.out.println(ch);
			}
		}
		   System.out.println(vow_count);
		   System.out.println(con_count);
    }

}
