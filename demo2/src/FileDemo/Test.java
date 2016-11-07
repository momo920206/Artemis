package FileDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;

public class Test {
	public static void main(String[] args) throws IOException {
		FileCreat fileCreat=new FileCreat("d:\\yuy\\exe.txt");
		fileCreat.creatFile(fileCreat.file);
	    FileWriter fileWriter=new FileWriter(fileCreat.file);
	    fileWriter.print("这是一个java上机题的文档文件：\r\n");
	    fileWriter.print("一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\r\n");
	    fileWriter.print("需要参的参数如下：通过程序读取本文件，解析下面的字符串得到需要的参数值\r\n");
	    fileWriter.print("100#168#1000\r\n");
	    fileWriter.print("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中尽可能的写注释让人一眼就看懂代码逻辑\r\n");
	    fileWriter.print("将计算的结果，最后再写回这个配置文件的尾部，有多个结果换行输出，以便方便阅读。\r\n");
	    Reader reader=new FileReader(fileCreat.file);
	    String temp;
	    int num[]=new int [3];
	    BufferedReader bufferedReader=new BufferedReader(reader);
	    while((temp=bufferedReader.readLine())!=null)
	    {
	    	String [] demo;
	    	System.out.println("读取当行内容:"+temp);
	    	if(temp.contains("#"))
	    	{
	    		demo=temp.split("#");
	    		for(int i=0;i<=demo.length-1;i++)
	    		{
	    			num[i]=Integer.valueOf(demo[i]);
	    		}
	    	}
	    }
	    System.out.println("参数分别为：");
	    for (int i : num) {
			System.out.print(i+"\t");
		}
	    System.out.println();
	    int number=num[0];
	    int plus=num[1];
	    int max=num[2];
	    fileWriter.print(Cale.calenum(number, max, plus).toString());
	    System.out.println("最后满足条件的结果为："+bufferedReader.readLine());
	    bufferedReader.close();
	}
}
