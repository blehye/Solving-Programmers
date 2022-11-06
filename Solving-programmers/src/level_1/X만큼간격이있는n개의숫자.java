package level_1;

import java.util.ArrayList;

public class X만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		ArrayList result = solution(x, n);
		System.out.println(result);
	}

	public static ArrayList solution(int x, int n) {
		ArrayList arr = new ArrayList();
		
		for (long i = 0; i < n; i++) {
			arr.add(x * (i + 1));
		}
		
		return arr;
	}

}
