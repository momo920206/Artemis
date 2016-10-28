package Sharp;



public class demo {
	int top, bot;

	public static void sharp(int top, int bot) {
		int Line=bot-top;
		for(int i=1;i<=Line;i++)
		{
			for(int j=1;j<=bot*2+1;j++)
			{
				if(j<=bot-top)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
