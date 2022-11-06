package level_1;

import java.util.ArrayList;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int result = solution(left, right);
		System.out.println(result);
	}

	public static int solution(int left, int right) {
		ArrayList list = new ArrayList();
		ArrayList result = new ArrayList();
		int sum = 0;

		for (int i = left; i <= right; i++) {
			list.clear();
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					list.add(j);

				}
			}
			sum = list.size();
			if (sum % 2 == 0) {
				result.add(i);
			} else {
				result.add(i * (-1));
			}
		}

		int answer = 0;
		for (int i = 0; i < result.size(); i++) {
			answer += (int) result.get(i);
		}
		return answer;
	}

}
