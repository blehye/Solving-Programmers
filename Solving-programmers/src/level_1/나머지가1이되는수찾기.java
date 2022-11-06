package level_1;

public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int result = solution(n);
		System.out.println(result);
	}

	public static int solution(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				return i;

			}
		}
		return 0;
	}

}
