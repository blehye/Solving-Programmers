package level_1;

public class 평균구하기 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		double result = solution(arr);
		System.out.println(result);
	}

	public static double solution(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double result = (double) sum / (arr.length);
		return result;
	}

}
