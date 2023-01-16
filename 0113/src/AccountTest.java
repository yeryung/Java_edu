import acc.Account;
import acc.SpecialAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialAccount sacc = new SpecialAccount(100,"홍길동",10000,"VIP");
		System.out.println(sacc.info());
		sacc.deposit(1000);
		System.out.println(sacc.info());
		
		//upcasting: 자식 객체를 부모타입의 레퍼런스 변수에 담을 수 있다
		Account acc = new SpecialAccount(101,"고길동",10000,"Gold");
		SpecialAccount ssacc = (SpecialAccount)acc;
		
		//다형성
		//upcasting 후 오버라이딩한 메소드 호출 시 자식 메소드 호출
		System.out.println(acc.info()); //부모에도 있고 자식에도 있는 메소드를 부모의 타입으로 호출 시 자식 메소드 호출

	}

}
