package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		ArrayList result = solution(numbers);
		System.out.println(result);
	}

	public static ArrayList solution(int[] numbers) {
		HashSet hs = new HashSet();
		int index = 0;

		while (index < numbers.length) {
			int target = numbers[index];
			for (int i = index + 1; i < numbers.length; i++) {
				hs.add(target + numbers[i]);
			}
			index++;
		}
		
		ArrayList list = new ArrayList(hs);
		Collections.sort(list);
		return list;
	}

}
