package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("abcd.java");
		f.createNewFile();
		System.out.println(f.exists());
		File f1=new File("sandhya");
		f1.mkdir();
		System.out.println(f1.exists());
		File f2=new File("sandhya","abcd.java");
		f2.createNewFile();	
	}
}
