package level_1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		int result = solution(n);
		System.out.println(result);
	}

	public static int solution(int n) {
		String str = Integer.toString(n);

		int answer = 0;

		for (int i = 0; i < str.length(); i++) {
			answer += Integer.parseInt(str.substring(i, i + 1));
		}

		return answer;
	}

}
