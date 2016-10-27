package classDemo2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out=new Out();
		out.execInIntetance();
		out.getInIntetance();
		out.print();
		
		//内部类
//		In inter=out.getInIntetance();
		Out.In inter=out.new In();
		inter.readOut();
		inter.print();
		inter.execInIntetance();
	}

}
