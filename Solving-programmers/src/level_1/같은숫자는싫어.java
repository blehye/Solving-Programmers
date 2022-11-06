package level_1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		ArrayList result = solution(arr);
		System.out.println(result);
	}

	public static ArrayList solution(int[] arr) {

		ArrayList list = new ArrayList();
		list.add(arr[0]);

		int index = 0;

		for (int i = 1; i < arr.length; i++) {
			if ((int) list.get(index) == arr[i]) {
				continue;
			} else {
				list.add(arr[i]);
				index++;
			}
		}

		return list;
	}

}
