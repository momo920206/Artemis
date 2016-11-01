
public class Test {
	public static void tr(int num)
	{
		//此循环为了控制行数
		for(int i=1;i<=num;i++)
		{
			//此循环为了打印空格
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//此为了打印*
			for(int j=1;j<=(num-i)*2+1;j++)
			{
				if(i==1 && j%2==1)
				{
					System.out.print("*");
				}
				else if(j==1||j==(num-i)*2+1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		tr(6);
	}
}
