package level_1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] result = solution(n, m);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] solution(int n, int m) {
		int min = (n < m) ? n : m;
		
		int gcd = 0;
		
		for(int i=1; i<=min; i++) {
			if(n%i==0 && m%i==0) {
				gcd = i;
			}
		}
		
		int lcm = n*m/gcd;
		
		int[] result = {gcd, lcm};
		
		return result;
	}

}
