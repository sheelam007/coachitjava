package Stringstask;

public class Split {

	public static void main(String[] args) {
		String str = "geakss for geekss";
		String []arr=str.split("@",2);
		System.out.println(arr);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(2,4));
        String s1="  hello string   ";  
        System.out.println(s1+"javatpoint");//without trim()  
        System.out.println(s1.trim()+"javatpoint");//with trim()  
    }
} 