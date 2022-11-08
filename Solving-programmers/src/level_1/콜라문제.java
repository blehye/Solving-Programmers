package level_1;

import java.util.ArrayList;

public class 콜라문제 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int n = 20;

		int result = solution(a, b, n);
		System.out.println(result);

	}

	public static int solution(int a, int b, int n) {

		ArrayList arr = new ArrayList();

		int temp = n;
		int share = (temp / a)*b;
		int remainder = temp % a;

		while ((share + remainder) >= a) {
			arr.add(share);
			temp = share + remainder;
			share = (temp / a)*b;
			remainder = temp % a;
		}
		arr.add(share);

		int result = 0;
		for (int i = 0; i < arr.size(); i++) {
			result += (int) arr.get(i);
		}

		int answer = result;
		return answer;
	}

}
