package level_1;

public class _2016년 {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;

		String result = solution(a, b);
		System.out.println(result);

	}

	public static String solution(int a, int b) {
		int[] lastDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		int totalDays = 0;
		
		for (int i = 0; i < a - 1; i++) {
			totalDays += lastDays[i];
		}
		
		totalDays += b;
		totalDays--;

		int remainder = totalDays % 7;
		String answer = day[remainder];
		return answer;
	}

}
