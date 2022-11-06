package level_1;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		long n = 121;
		long result = solution(n);
		System.out.println(result);
	}

	public static long solution(long n) {
		long index = 1;
		for (long i = 1; i < 90000000; i++) {
			if (i * i == n) {
				index = i;
				break;
			}
			if (i * i > n) {
				break;
			}
		}

		if (index == 1 && n != 1) {
			return -1;
		} else {
			return (index + 1) * (index + 1);
		}
	}

}
