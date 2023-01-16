class Calculator{
	int val1;
	int val2;
	
	//Method overloading
	//동일한 클래스에 동일한 이름의 메소드가 여러개 올 수 있다.
	//단, 파라미터의 타입 또는 개수가 달라야 한다.
	//메서드의 리턴 타입은 영향을 끼치지 않는다.
	
	public Calculator() {} //기본 생성자, 생성자가 없을 때만 자동 생성됨. 생성자가 하나라도 있으면 수동으로 만들어야 함.
	
	public Calculator(int val1) {
		// TODO Auto-generated constructor stub
		this.val1 = val1;
	}
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	

	int add() {
		return val1+val2;
	}
	
	int add(int data1, int data2) {
		return data1+data2;
	}
	
	int add(int d1, int d2, int d3) {
		return d1+d2+d3;
	}
	
	double add(double d1, double d2) {
		return d1+d2;
	}
	
}
	
public class MethodTest1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10,20);
		Calculator cal2 = new Calculator(100);
		Calculator cal3 = new Calculator();
		System.out.println(cal.add());
		System.out.println(cal.add(100,200));
		System.out.println(cal.add(100.0,200.0));
	}

}
