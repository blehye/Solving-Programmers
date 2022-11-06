package level_1;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		String result = solution(n);
		System.out.println(result);
	}

	public static String solution(int n) {
		int mul = n / 2;

		String result;

		if (n % 2 == 0) {
			result = "수박".repeat(mul);
		} else {
			result = "수박".repeat(mul);
			result += "수";
		}

		return result;
	}

}
