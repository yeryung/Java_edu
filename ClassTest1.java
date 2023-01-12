class Person{
	int age;
	String name;
	double height;
	
	//클래스 안에서는 변수 공유
	String info() {
		return "이름:"+name+", 나이:"+age+", 키:"+height;
	}
}

public class ClassTest1 {
	public static void personInfo(Person p2) {
		p2.age = 40;
		System.out.println(p2.info());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.age = 20;
		p.height = 175.4;
		p.name="홍길동";
		System.out.println(p.info());
		
		personInfo(p);
		System.out.println(p.info());

	}

}
