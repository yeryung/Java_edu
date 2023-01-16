public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5,4,10,20,30};
		int[] arr2 = {1,2,0,5};
		
		try {
			for(int i=0; i<arr1.length; i++) {
				System.out.println(arr1[i]/arr2[i]);
			}
		} catch(ArithmeticException e) {
			System.out.println(0);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(0);
		}
//		for(int i=0; i<arr1.length; i++) {
//			try {
//				System.out.println(arr1[i]/arr2[i]);
//			} catch(ArithmeticException ae) {
//				System.out.println(0);
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(0);
//			}
//		}
	}
}

