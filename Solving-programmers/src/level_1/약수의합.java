package level_1;

public class 약수의합 {

	public static void main(String[] args) {
		int n = 12;
		int result = solution(n);
		System.out.println(result);
	}

	public static int solution(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

}
