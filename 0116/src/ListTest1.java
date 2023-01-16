import java.util.ArrayList;
import java.util.Iterator;

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String info() {
		return "이름:"+name+", 나이:"+age;
	}
	public String toString() {
		return "이름: "+name+", 나이:"+age;
	}
}
public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("hong");
		list.add("park");
		list.add("song");
		list.add(0,"lee");
		for(Object s: list) {
			System.out.println(s);
		}
		
//		for(String s: list) {
//			System.out.println(s);
//		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		
		ArrayList<Person> list3 = new ArrayList<Person>();
		list3.add(new Person(20, "홍길동"));
		list3.add(new Person(30, "하길동"));
		list3.add(new Person(40, "고길동"));
		
//		for(Object p:list3) {
//			System.out.println(((Person)p).info());
//			
//		}
		
		for(Person p:list3) {
			System.out.println(p.info());	
		}
		
		Iterator<Person> it = list3.iterator();
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
