package kt.ep;

public class Permanent extends Employee{
	private int pay;
	public Permanent(int id, String name, int pay) {
		super(id,name);
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return super.toString()+", 급여:"+getPay();
	}
}
