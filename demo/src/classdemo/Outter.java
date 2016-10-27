package classdemo;

public class Outter {
	private Inner inner;
	String name="Outter";
	public void print()
	{
		System.out.println("此为外部类的打印方法");
	}
	public Inner getInnerInstance()
	{
		if(inner==null)
		{
			inner=new Inner();
		}
		return inner;
	}
	public void readInnerName()
	{
		String tmp=getInnerInstance().name;
		System.out.println("此为外部类的读取内部类名称的方法，内部类的名字是"+tmp);
	}
	public void execInnerPrint() {
		System.out.println("此为外部类调用内部类的方法");
		getInnerInstance().print();
		System.out.println("外部类的调用内部类的方法结束");
	}
	
	class Inner
	{
		String name="内部类";
		public void print()
		{
			System.out.println("此为内部类");
		}
		public void readOutterName()
		{
			System.out.println("此为内部类的读取外部类名称的方法,内部类的名称为"+name+"，调用的外部类的名称为"+Outter.this.name);
		}
		public void execOutterPrint() {
			System.out.println("此为内部方法");
			Outter.this.print();
			System.out.println("调用成功，方法结束");
		}
	}
	public static void main(String[] args) {
		Outter outter=new Outter();
		outter.print();
		outter.readInnerName();
		outter.execInnerPrint();
		
		Outter.Inner inner=outter.getInnerInstance();
		inner.print();
		inner.readOutterName();
		inner.execOutterPrint();
	}

}
