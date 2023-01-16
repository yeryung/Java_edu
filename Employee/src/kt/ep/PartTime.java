package kt.ep;

public class PartTime extends Employee implements IBusinessTrip{
	private int payPerTime;
	private int time;
	public PartTime() {}
	public PartTime(int id, String name, int payPerTime, int time) {
		super(id,name);
		this.payPerTime = payPerTime;
		this.time = time;
	}
	public String toString() {
		return super.toString()+ "급여: "+payPerTime;
	}
	@Override
	public int getPay() {
		return payPerTime*time;
	}
	@Override
	public void goBusinessTrip(int day) {
		// TODO Auto-generated method stub
		time += day*24;
		
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	

}
