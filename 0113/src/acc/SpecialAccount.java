package acc;

public class SpecialAccount extends Account {
	String grade;
	double rate;

	public SpecialAccount(int num, String name, int balance, String grade) {
//		this.num = num;
//		this.name = name;
//		this.balance = balance;
		super(num, name, balance); //부모 생성자
		setGrade(grade);
	}
	public SpecialAccount() {}
	public String getGrade() {
		return grade;
	}
	public String info() {
		return super.info()+", 등급:"+grade;
	}
	public void deposit(int money) {
//		if(money>0) {
//			balance += money+(int)(money*rate);
//		}
		super.deposit(money+(int)(money*rate));
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch(this.grade) {
		case "VIP": rate=0.04; break;
		case "Gold": rate=0.03; break;
		case "Silver": rate=0.02; break;
		case "Normal": rate=0.01; break;
		}
	}
	
	
	
	
	
	
	
	
	
}
