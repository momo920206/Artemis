package interfaceDemo;

public interface Male {
	public final static int eyesnums=2;
	public final static int mouthnums=1;
	public final static int earsnums=2;
	public final static int nosenums=1;
	public void speak();
	public void run();
	public void eat();
	default public void otherprint()
	{
		System.out.println("此为男人这个接口的默认方法");
	}
}
