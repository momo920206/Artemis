package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	static File file=null;
	static FileOutputStream outputStream=null;
	public FileWriter(File filename) {
		// TODO Auto-generated constructor stub
		file=new File(filename.getPath());
	}
	public static void print(String str) throws IOException
	{
		outputStream=new FileOutputStream(file,true);
		byte b []=str.getBytes();
		outputStream.write(b);
	}
	
}
