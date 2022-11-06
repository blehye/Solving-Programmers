package level_1;

import java.util.ArrayList;

public class 소수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int result = solution(n);
		System.out.println(result);
	}

	public static int solution(int n) {

		ArrayList list = new ArrayList();

		boolean[] prime = new boolean[n + 1];

		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i * i <= n; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (!prime[i]) {
				list.add(i);
			}
		}
		return list.size();
	}

}
