
public class Array2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {1,2,3,4};
		int[][] arr2 = new int[][] {
			{10,20,30,40},
			{1,2,3,4},
			{100,200,300,400}
		};
		int[][] arr3 = new int[3][];
		arr3[0] = new int[] {10,20,30,40,0};
		arr3[1] = new int[] {1,2,3,4,0};
		arr3[2] = new int[] {100,200,300,400,0};
		arr3[3] = new int[] {0,0,0,0,0};
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		
		for(int i=0; i<arr3.length-1; i++) {
			int sum = 0;
			for(int j=0; j<arr3[i].length-1; j++) {
				//System.out.println(arr3[i][j]);
				sum += arr3[i][j];
				//System.out.println(sum);
			}
			arr3[i][4] = sum;
		}
		
		for(int i=0; i<arr3[0].length-1; i++) {
			int sum = 0;
			for(int j=0; j<arr3.length-1; j++) {
				System.out.println(arr3[j][i]);
				sum += arr3[j][i];
				//System.out.println(sum);
			}
			arr3[3][i] = sum;
		}
		
		
		
		
		
		
	}
}
