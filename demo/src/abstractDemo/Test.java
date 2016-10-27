package abstractDemo;

public class Test {
	public static void main(String[] args) {
		Person chinese=new Chinese();
		Person american=new Thai();
		Person thai=new American();
		chinese.eat();
		chinese.speak();
		american.walk();
		american.eat();
		thai.work();
		thai.speak();
	}
}
