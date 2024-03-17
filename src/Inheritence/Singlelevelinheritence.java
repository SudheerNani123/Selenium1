package Inheritence;

class A{
	public void a1() {
		System.out.println("i am a1");
	}
}

class B extends A{
	public void b1() {
		System.out.println("i am b1");
	}
}
public class Singlelevelinheritence {
	

	public static void main(String[] args) {
		A a = new A();
		a.a1();
		
		System.out.println("--------");
		B b = new B();
		b.a1();
		b.b1();
		
	}
}
