import java.util.HashMap;

class Student extends Person{
	int num;
	String major;
	Student(int age, String name, int num, String major){
		super(age,name);
		this.num = num;
		this.major = major;
	}
	public String toString() {
		return super.toString()+", 학번:"+num+", 전공:"+major;
	}
}
public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> studs = new HashMap<>();
		studs.put(100, new Student(20,"홍길동",100,"산업공학"));
		studs.put(101, new Student(21,"김길동",101,"인지심리학"));
		studs.put(102, new Student(22,"하길동",102,"실용음악"));
		
		// value 목록 이용하여 출력
//		for(Student s: studs.values()) {
//			System.out.println(s);
//		}
		//키 값 목록을 이용하여 내용 출력
		for(Integer key: studs.keySet()) {
			System.out.println(studs.get(key));
		}
	}

}
