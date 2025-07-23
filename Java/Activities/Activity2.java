package Activities;

public class Activity2 {

	public static void main(String[] args) {
		int[] number= {10, 77, 10, 54, -11, 10};
		int findNum=10;
		int sum=30;
		System.out.println("Result: " + result(number, findNum, sum));
		
	}
	
		public static boolean result(int[] numbers, int findNum, int sum) {
	        int temp_sum = 0;
	        for (int number : numbers) {
	            if (number == findNum) {
	                temp_sum += findNum;
	            }
	            if (temp_sum > sum) {
	                break;
	            }
	        }
	        return temp_sum == sum;
	    }
	

}
