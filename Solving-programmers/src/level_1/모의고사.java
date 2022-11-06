package level_1;

import java.util.ArrayList;

public class 모의고사 {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		ArrayList result = solution(answers);
		System.out.println(result);
	}

	public static ArrayList solution(int[] answers) {
		int[] supoja1 = { 1, 2, 3, 4, 5 };
		int[] supoja2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] supoja3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == supoja1[i % 5]) {
				cnt1++;
			}
			if (answers[i] == supoja2[i % 8]) {
				cnt2++;
			}
			if (answers[i] == supoja3[i % 10]) {
				cnt3++;
			}
		}

		int max = Math.max(cnt1, Math.max(cnt2, cnt3));

		ArrayList list = new ArrayList();
		if (max == cnt1) {
			list.add(1);
		}
		if (max == cnt2) {
			list.add(2);
		}
		if (max == cnt3) {
			list.add(3);
		}
		return list;
	}

}
