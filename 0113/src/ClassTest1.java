import acc.Account;

public class ClassTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(1001,"홍길동",100000);
		acc1.deposit(10000);
		
		System.out.println(acc1.info());
		
		Account acc2 = new Account(1001,"고길동",200000);
		acc2.withdraw(10000);
		
		System.out.println(acc2.info());
	}

}
