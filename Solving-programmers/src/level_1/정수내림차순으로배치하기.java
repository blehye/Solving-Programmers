package level_1;

import java.util.ArrayList;
import java.util.Comparator;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		long result = solution(n);
		System.out.println(result);
	}

	public static long solution(long n) {
		String str = Long.toString(n);

		ArrayList list = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			list.add(str.substring(i, i + 1));
		}

		list.sort(Comparator.reverseOrder());

		String str2 = "";
		for (int i = 0; i < list.size(); i++) {
			str2 += list.get(i);
		}

		return Long.parseLong(str2);
	}

}
