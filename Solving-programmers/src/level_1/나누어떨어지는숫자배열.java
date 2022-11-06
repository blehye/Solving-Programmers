package level_1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;
		ArrayList result = solution(arr, divisor);
		System.out.println(result);
	}

	public static ArrayList solution(int[] arr, int divisor) {
		ArrayList list = new ArrayList();

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
				cnt++;
			}
		}

		if (cnt == 0) {
			list.add(-1);
		}

		Collections.sort(list);

		return list;
	}

}
