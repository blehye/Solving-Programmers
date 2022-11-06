package level_1;

import java.util.HashMap;

public class 폰켓몬 {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 3 };
		int result = solution(nums);
		System.out.println(result);

	}

	public static int solution(int[] nums) {
		int len = nums.length / 2;
		int cnt = 0;

		int answer = 0;
		HashMap<Integer, Integer> hm = new HashMap();

		for (int n : nums) {
			hm.put(n, hm.getOrDefault(n, 0) + 1);
		}

		for (Integer key : hm.keySet()) {
			cnt++;
		}

		if (cnt < len) {
			answer = cnt;
		} else if (cnt >= len) {
			answer = len;
		}
		return answer;
	}

}
