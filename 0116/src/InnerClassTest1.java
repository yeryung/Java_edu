class Temp{
	int num = 10;
	static int snum = 20;
	
	class Temp2{
		int num2 = num;
		int snum2 = snum;
	}
	static class Temp3{
		//int num3 = num; //static class에서 outer class 변수 사용 못함.
		int snum3 = snum;
	}
	void method1() {
		// Temp2 class 생성
		Temp2 temp2 = new Temp2();
		Temp3 temp3 = new Temp3();
	}
	static void method2(){
		// Temp2 class 생성
		Temp temp = new Temp();
		Temp2 temp2 = temp.new Temp2();
		
		//Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	void method3() {
		int iv=0;
		final int LV=0;
		class Temp4{
			int numt4 = iv;
			int cnumt4 = LV;
		}
	}
}
public class InnerClassTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Temp2 class 생성
		Temp temp = new Temp();
		Temp.Temp2 temp2 = temp.new Temp2();
		
		//Temp3 class 생성
		Temp.Temp3 temp3 = new Temp.Temp3();
	}
}
