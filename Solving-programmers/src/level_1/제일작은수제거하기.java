package level_1;

import java.util.ArrayList;
import java.util.Collections;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		ArrayList result = solution(arr);
		System.out.println(result);
	}

	public static ArrayList solution(int[] arr) {
		ArrayList list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		ArrayList copyList = new ArrayList();
		copyList.add(-1);
		if (arr.length == 1) {
			return copyList;

		}
		copyList.remove(0);
		for (int i = 0; i < arr.length; i++) {

			copyList.add(arr[i]);
		}

		Collections.sort(list);
		int minNum = (int) list.get(0);
		int index = 0;
		for (int i = 0; i < copyList.size(); i++) {
			if ((int) copyList.get(i) == minNum) {
				index = i;
			}
		}
		copyList.remove(index);

		return copyList;
	}

}
