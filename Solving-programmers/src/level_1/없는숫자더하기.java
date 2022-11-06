package level_1;

import java.util.HashMap;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int result = solution(numbers);
		System.out.println(result);
	}

	public static int solution(int[] numbers) {
		HashMap<Integer, Integer> hm = new HashMap();
		int answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			hm.put(numbers[i], 1);
		}

		for (int i = 0; i <= 9; i++) {
			if (!hm.containsKey(i)) {
				answer += i;
			}
		}
		return answer;
	}

}
