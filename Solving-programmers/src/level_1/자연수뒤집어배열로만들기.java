package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		long[] result = solution(n);
		System.out.println(Arrays.toString(result));
	}

	public static long[] solution(long n) {
		String str = Long.toString(n);

		ArrayList list = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			list.add(Long.parseLong(str.substring(i, i + 1)));
		}

		Collections.reverse(list);

		long[] result = new long[list.size()];

		for (int i = 0; i < list.size(); i++) {
			result[i] = (long) list.get(i);
		}

		return result;
	}

}
