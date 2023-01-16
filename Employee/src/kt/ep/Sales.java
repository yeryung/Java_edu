package kt.ep;

public class Sales extends Permanent implements IBusinessTrip{
	private int incentive;
	public Sales(int id, String name, int pay, int incentive) {
		super(id,name,pay);
		this.incentive  = incentive;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	public int getPay() {
		return super.getPay()+getIncentive();
	}
	@Override
	public void goBusinessTrip(int day) {
		// TODO Auto-generated method stub
		incentive += (day*10000);
		
	}
}
