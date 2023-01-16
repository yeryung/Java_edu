class Base{
	private int pv = 1;
	protected int rv = 2;
	int dv = 3;
	public int bv = 4;
	void func() {
		pv = 10;
		rv = 20;
		dv = 30;
		bv = 40;
	}
}

class Derived extends Base{
	void funct() {
		//pv = 10; //부모의 private 변수 접근 불가능
		rv = 20;
		dv = 30;
		bv = 40;
	}
}

public class AccessTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		//b.pv = 100; //private 변수 접근 불가능
		Derived d = new Derived();
		//d.pv = 100; //private 변수 접근 불가능
		d.rv = 200; // 같은 패키지안에 있기에 가능 // 경우에 따라 가능 // 같은 패키지에 있을 경우 접근 가능
		d.dv = 200; // 경우에 따라 가능. 같은 패키지에 있을 경우 접근 가능.
		d.bv = 400;
	}

}
