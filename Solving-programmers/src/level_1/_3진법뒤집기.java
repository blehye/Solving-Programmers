package level_1;

import java.util.ArrayList;
import java.util.Collections;

public class _3진법뒤집기 {

	public static void main(String[] args) {
		int n = 45;
		long result = solution(n);
		System.out.println(result);
	}

	public static long solution(int n) {
		int share = 3;
		int remainder = 0;
		ArrayList list = new ArrayList();
		
		while (share > 2) {
			share = (int) (n / 3);
			remainder = (int) (n % 3);
			list.add(remainder);
			n = share;
		}
		
		if (share == 1) {
			list.add(1);
		}
		
		if (share == 2) {
			list.add(2);
		}
		
		Collections.reverse(list);

		long sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += (int) list.get(i) * Math.pow(3, i);
		}
		
		return sum;
	}

}
