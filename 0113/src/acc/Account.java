package acc;

public class Account {
	int num;
	String name;
	int balance;
	
	//생성자
	public Account() {};
	public Account(int num, String name, int balance) {
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String info() {
		return "번호:"+num+", 이름:"+name+", 잔액:"+balance;
	}
	
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
		}
	}
	public void withdraw(int money) {
		if(balance>=money) {
			balance -= money;
		}
	}
}
