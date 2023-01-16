class Number{
	int m=10;
	int method() {
		return m;
	}
}
public class AnnoyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number = new Number() { //익명 클래스, Number: 조상클래스, 즉, Number 클래스로부터 상속받아 n 변수를 추가하고, method
			int n=20;
			int method() {
				return super.method()+n;
			}
		};
		System.out.println(number.method());

	}

}
