package level_1;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		ArrayList result = solution(array, commands);
		System.out.println(result);
	}

	public static ArrayList solution(int[] array, int[][] commands) {
		ArrayList list = new ArrayList();
		ArrayList answer = new ArrayList();

		for (int i = 0; i < commands.length; i++) {
			list.clear();
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];

			for (int j = a - 1; j < b; j++) {
				list.add(array[j]);
			}
			Collections.sort(list);

			answer.add(list.get(c - 1));
		}
		return answer;
	}

}
