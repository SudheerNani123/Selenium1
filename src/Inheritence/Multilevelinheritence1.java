package Inheritence;

class X {
	public void x1() {
		System.out.println("am x1");
	}
}
class Y extends X {
	public void y1() {
		System.out.println("am y1");
	}
}
class Z extends Y {
	public void z1() {
		System.out.println("am z1");
	}
}


public class Multilevelinheritence1 {
	public static void main(String[] args) {
		
		X x = new X();
		x.x1();
		System.out.println("-----------");
		
		Y y = new Y();
		y.y1();
		y.x1();
		
		System.out.println("-----------");
		
		Z z = new Z();
		z.x1();
		z.y1();
		z.z1();
	}

}
