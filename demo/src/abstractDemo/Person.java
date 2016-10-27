package abstractDemo;

public abstract class Person {
	public abstract void eat();

	public abstract void walk();

	public abstract void speak();

	public abstract void work();
}

class Chinese extends Person {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("中国人吃饭用筷子");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("中国人行走方式是骑自行车");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("中国人在中国工作");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("中国人说普通话");
	}
}

class American extends Person {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("美国人吃饭用叉子");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("美国人行走方式是开汽车");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("美国人说美式英语");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("美国人在美国工作");
	}
}

class Thai extends Person {
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("泰国人走路方式为走路");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("泰国人");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("泰国人吃榴莲");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("泰国人工作在泰国");
	}
}

