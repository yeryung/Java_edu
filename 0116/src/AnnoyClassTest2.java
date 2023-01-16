class Button{
	void onClick() {
		System.out.println("버튼이 꾹 눌림");
	}
}

class LoginButton extends Button{
	void onClick() {
		super.onClick();
		System.out.println("로그인 처리");
	}
}

public class AnnoyClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button lb = new Button() {
			void onClick() {
				super.onClick();
				System.out.println("로그인 처리");
			}
		};
		lb.onClick();
		
		Button jb = new Button() {
			void onClick() {
				super.onClick();
				System.out.println("회원가입 처리");
			}
		};
		jb.onClick();
	}
}