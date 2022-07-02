package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		FileWriter  fw=new FileWriter("abcd.java");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write('a');
		bw.write('c');
		bw.newLine();//fw.write("\n")
		bw.write("buffer writer demo");
		bw.flush();
		bw.close();

	}
   
 }
