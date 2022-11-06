package level_1;

public class 음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };
		int result = solution(absolutes, signs);
		System.out.println(result);
	}

	public static int solution(int[] absolutes, boolean[] signs) {
		int result = 0;
		int sum = 0;

		for (int i = 0; i < absolutes.length; i++) {
			for (int j = i; j <= i; j++) {
				if (signs[j] == true) {
					result = absolutes[i];

					sum += result;

				} else {
					result = absolutes[i] * (-1);

					sum += result;
				}
			}
		}
		return sum;
	}

}
