package interfaceDemo;

class Chinese implements Male {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("中国人说汉语");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("中国人喜欢夜跑");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("中国人吃米饭");
	}

	public void print() {
		System.out.println("中国人有" + this.eyesnums + "只眼睛、" + this.mouthnums + "张嘴巴、" + this.earsnums + "只耳朵、"
				+ this.nosenums + "个鼻子。");
	}

}

class American implements Male {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("美国人说美式英语");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("美国人吃汉堡包");
	}

	public void print() {
		System.out.println("美国人有" + this.eyesnums + "只蓝色眼睛、" + this.mouthnums + "张大嘴巴、" + this.earsnums + "只大耳朵、"
				+ this.nosenums + "个高鼻子。");
		otherprint();
	}
}

public class PersonTest {
	public static void main(String[] args) 
	{
		Chinese chinese=new Chinese();
		chinese.eat();
		chinese.run();
		chinese.speak();
		chinese.print();
		//实例化美国人
		American american=new American();
		american.eat();
		american.run();
		american.speak();
		american.print();
	}
}
