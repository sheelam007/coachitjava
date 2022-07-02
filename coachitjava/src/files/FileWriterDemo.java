package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abcd.java");
	      fw.write('c');
	      fw.write("\n");
	      fw.write("file writer demo");
	      fw.flush();
	      fw.close();
	}
  }
