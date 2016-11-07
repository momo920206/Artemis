package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileCreat {
		static File file=null;
		public FileCreat(String path) {
			// TODO Auto-generated constructor stub
			file=new File(path);
		}
		public static int cando(String path) {
			
			if(!file.getParentFile().exists())
			{
				System.out.println("目录不存在");
				return -1;
			}
			else if (!file.exists()) {
				System.out.println("文件不存在");
				return -2;
			}
			else {
				return 0;
			}
			
			}
		
		public static void creatFile(File file) throws IOException
		{
			if(cando(file.getPath())==-1)
			{
				file.getParentFile().mkdirs();
				System.out.println("创建目录成功");
			}
			if(cando(file.getPath())==-2) {
				file.createNewFile();
				System.out.println("创建文件成功");
			}
			else {
				System.out.println("文件目录已存在，删除目录与文件");
				file.delete();file.getParentFile().delete();
				file.getParentFile().mkdirs();
				System.out.println("创建目录成功");
				file.createNewFile();
				System.out.println("创建文件成功");
			}

		}
	}

