
public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=95, eng =88, math=75;
		double avg = (kor+eng+math)/3.0;
		int avg2 = (int) (avg/10);
		char grade;
		switch(avg2) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'E';
		}
		
		System.out.println("평균: "+avg+", 학점: "+grade);

	}

}
