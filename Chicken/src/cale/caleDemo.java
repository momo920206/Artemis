package cale;

public class caleDemo {
	public static void caleChicken(int money,int num)
	{
		//最外层循环计量小鸡的数量，循环的次数为输入的数量的最大值
		for(int chicken=0;chicken<=num;chicken=chicken+3)
		{
			//次循环计量母鸡的数量，循环的次数为输入数量除以单价3
			for(int hen=0;hen<=num/3;hen++)
			{
				//内循环公鸡的数量，循环的次数为输入数量除以单价5
				for(int rooster=0;rooster<=num/5;rooster++)
				{
					//加判断，满足判断打印只数，判断条件是所有鸡的综合为num，金额分别是各自数量乘以单价。
					if(chicken+hen+rooster==num && chicken/3+hen*3+rooster*5==money)
					{
						System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");
					}
				}
			}
		}
	}
	public static void print(int money,int num)
	{
		
		//最外层循环计量小鸡的数量，循环的次数为输入的数量的最大值
		int roostermax=money/4;
		for(int rooster=0;rooster<=roostermax*4/7;rooster+=4)
		{
			int hen=roostermax-7*rooster/4;
			int chicken=num-rooster-hen;
			System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");
		}
	}
	
	public static void print2(int money,int num)
	{
		
		//最外层循环计量小鸡的数量，循环的次数为输入的数量的最大值
		int hen=money/4;
		int chicken=num-money%5-hen;
		for(int rooster=0;rooster<=money/5;rooster+=4)
		{
			
			
			if(rooster+hen+chicken==num&&rooster*5+hen*3+chicken/3==money)
			{
				System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");	
				hen-=7;
				chicken=chicken+3;
			}
			if(hen<0||chicken<0||rooster<0)
			{
				break;
			}
			

		}
	}
	
	public static void print3(int money,int num)
	{
		
		//最外层循环计量小鸡的数量，循环的次数为输入的数量的最大值

		for(int chicken=0;chicken<=num;chicken+=3)
		{
			int hen=(8*chicken+3*money-9*num)/6;
			int rooster=(15*num-14*chicken-3*money)/6;
			if (hen<0||rooster<0) {
				continue;
			}
			if(rooster+hen+chicken==num&&rooster*5+hen*3+chicken/3==money)
			{
				System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");	

			}
		}
	}
	
	public static void main(String[] args) {
		caleChicken(150,100);
		print3(150, 100);
		
	}
}
