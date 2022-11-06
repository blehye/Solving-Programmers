package level_1;

public class 콜라츠추측 {

	public static void main(String[] args) {
		int n = 6;
		int result = solution(n);
		System.out.println(result);
	}

	public static int solution(int num2) {
		long num = (long) num2;
		int cnt = 0;

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
				cnt++;
			} else {
				num = num * 3 + 1;
				cnt++;
			}
			if (cnt == 500) {
				cnt = -1;
				break;
			}

		}
		return cnt;
	}

}
