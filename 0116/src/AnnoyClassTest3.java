interface IClick{
	void click();
}

class MyButton{
	IClick iclick;
	void onClick() {
		System.out.println("꾹 눌림");
		if(iclick!=null) {
			iclick.click();
		}
	}
	void addClickListener(IClick iclick) {
		this.iclick = iclick;
	}
}
public class AnnoyClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton loginBtn = new MyButton();
		loginBtn.addClickListener(new IClick() {
		public void click() {
			System.out.println("로그인 처리");
		}
	});
  }
}