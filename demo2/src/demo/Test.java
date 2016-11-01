package demo;

public class Test {
	public static void cale(int a,int b, int c)
	{
		double x1=0; double x2=0;
		double dat=b*b-4*a*c;
		if(a==0)
		{
			System.out.println("输出非法");
			return;
		}
		if(dat<0)
		{
			System.out.println("此二元一次方程没有实数根");
		}
        if(dat==0) 
		{
			x1=x2=(-b)/2*a;
		}
		if(dat>0)
		{
			x1=(-b+Math.sqrt(dat))/2*a;
			x2=(-b-Math.sqrt(dat))/2*a;
		}
		System.out.println("此一元二次方程组其中一个解X1="+x1+"另一个解X2="+x2);
	}

}
