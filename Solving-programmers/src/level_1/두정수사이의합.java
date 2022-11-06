package level_1;

public class 두정수사이의합 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		long result = solution(a, b);
		System.out.println(result);
	}

	public static long solution(int a, int b) {
		long sum = 0;

		if (a == b) {
			return a;
		}

		if (a < b) {
			for (int i = 0; i <= b - a; i++) {
				sum += a + i;
			}
			return sum;
		}

		if (a > b) {
			for (int i = 0; i <= a - b; i++) {
				sum += b + i;
			}
			return sum;
		}

		return sum;
	}

}
