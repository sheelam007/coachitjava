package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("abcd.java");
		int i=fr.read();
		while(i!=-1) {
			System.out.println(i);
			i=fr.read();
		}
	}
}
