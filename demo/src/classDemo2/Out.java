package classDemo2;

public class Out {
	String name="外部类";
	private In inter;
	public void print()
	{
		System.out.println("外部类打印方法");
	}
	public In getInIntetance()
	{
		if (inter==null) {
			inter=new In();
		}
		return inter;
	}
	public void execInIntetance() {
		System.out.println("此为外部类调用内部类的打印方法");
		getInIntetance().print();
		System.out.println("打印成功，外部类调用内部类的打印方法结束");
		
	}
	public class In
	{

		String innername="内部类";
		public void print()
		{
			System.out.println("此为内部类");
		}
		public void readOut()
		{
			System.out.println("此为内部类的方法，内部类的名称是"+innername+"可调用此内部类的外部类名称为"+Out.this.name);
		}
		public void execInIntetance()
		{
			System.out.println("此为内部方法");
			Out.this.print();
			System.out.println("调用成功，方法结束");
		}
	}
}
