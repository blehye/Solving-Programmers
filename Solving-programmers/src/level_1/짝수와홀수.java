package level_1;

public class 짝수와홀수 {

	public static void main(String[] args) {
		int num = 3;
		String result = solution(num);
		System.out.println(result);
	}

	public static String solution(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}

	}

}
