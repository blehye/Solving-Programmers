package level_0;

import java.util.Arrays;

public class 분수의덧셈 {

	public static void main(String[] args) {
		int denum1 = 9;
		int num1 = 2;
		int denum2 = 1;
		int num2 = 3;
		
		int[] result = solution(denum1, num1, denum2, num2);
		System.out.println(Arrays.toString(result));

	}

	public static int[] solution(int denum1, int num1, int denum2, int num2) {
		
		int bunmo = num1 * num2;
		int bunja = (num2 * denum1) + (num1 * denum2);
		int[] answer = new int[2];
		
		if(bunmo == bunja) {
			answer[0] = 1;
			answer[1] = 1;
			return answer;
		}
		
		int x = bunmo > bunja ? bunja : bunmo;

		for(int i=x; i>=2; i--) {
			if(bunmo%i==0 && bunja%i==0) {
				bunmo = bunmo/i;
				bunja = bunja/i;
			}
		}
		
		answer[0] = bunja;
		answer[1] = bunmo;
		
		return answer;
	}

}
