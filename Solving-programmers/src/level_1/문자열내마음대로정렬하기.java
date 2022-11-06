package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] s = { "sun", "bed", "car" };
		int n = 1;
		String[] result = solution(s, n);
		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] s, int n) {
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			list.add(s[i].charAt(n) + s[i]);
		}

		Collections.sort(list);

		String[] answer = new String[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1, list.get(i).length());
		}

		return answer;
	}

}
