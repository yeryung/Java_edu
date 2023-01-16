interface IMovable{
	void move(int x, int y);
}
interface IFiterable extends IMovable{
	
}
class Filter implements IMovable{
	// public으로 명시해줘야 함. 오버라이딩 시 정확히 
	public void move(int x, int y) {
		
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
