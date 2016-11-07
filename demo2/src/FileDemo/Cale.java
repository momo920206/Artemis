package FileDemo;

import java.util.LinkedList;
import java.util.List;

public class Cale {
	public static List<Integer> calenum(int num,int max,int plus)
	{
		List<Integer> result=new LinkedList<Integer>();
		int m,n;
		for(int i=1;i<max;i++)
		{
			m=(int)Math.sqrt(num+i);
			n=(int)Math.sqrt(num+plus+i);
			if(m*m==i+num &&n*n==i+num+plus)
			{
				result.add(i);
			}
		}
		return result;
	}
}
