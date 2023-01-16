import java.util.StringTokenizer;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "string";
		String str2 = "string";
		String str3 = new String("string");
		String str4 = new String("string");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str2==str3);
		
//		Person p1 = new Person(10,"hong");
//		Person p2 = new Person(10,"hong");
//		Person p3 = p1;
//		System.out.println(p1==p2);
//		System.out.println(p1==p3);
		
		//원본이 바뀌는 것이 아님. 주의하기!
		System.out.println(str1.charAt(5));
		String rstr = str1.replace('i','o');
		System.out.println(str1);
		System.out.println(rstr);
		
		//String animals = "monkey,dog,cat";
		//String[] animalArr = animals.split(",");
//		for(String ani : animalArr) {
//			System.out.println(ani);
//		}
		String animals = "monkey,dog-cat";
		StringTokenizer stk = new StringTokenizer(animals,",-");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
	}

}
