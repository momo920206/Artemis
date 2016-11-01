package Sharp;

public class Triangle {
	public static void CreatIsoscelesTriangle1(int num) {
		// 此类为正三角型图形打印
		for (int i = 1; i <= num; i++) {

			// 此循环为打印空格
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			// 此循环为打印*
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void CreatIsoscelesTriangle2(int num) {
		// 此类为正三角型空心图形打印
		for (int i = 1; i <= num; i++) {

			// 此循环为打印空格
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			// 此循环为打印*
			for (int j = 1; j <= i * 2 - 1; j++) {
				if(i==num&&j%2==1)
				{
					System.out.print("*");
				}
				else if(j==1||j==i*2-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void CreatIsoscelesTriangle3(int num) {
		//此处为倒等腰三角形
		for (int i = 0; i < num; i++) {
			//此处为打印空格
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//此处打印*
			for(int j=1;j<=2*(num-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void CreatIsoscelesTriangle4(int num) 
	{
		for(int i=1;i<=num;i++)
		{
			//空格
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//形状
			for(int j=1;j<=(num-i)*2+1;j++)
			{
				
				if(j==1||j==(num-i)*2+1)
				{
					System.out.print("*");
				}
				else if(i==1&&j%2==1)
				{
					System.out.print("*");
				}
				else //判断是否打印空
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
