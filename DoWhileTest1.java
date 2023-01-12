import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int data;
		do {
			data = sc.nextInt();
			sum += data;
		}while(data!=0);
		
		System.out.println(sum);
	}

}
