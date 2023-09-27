package level_1;

import java.util.ArrayList;
import java.util.List;

public class 기사단원의무기 {

	public static void main(String[] args) {
		int number = 10;
		int limit = 3;
		int power = 2;
		
		System.out.println(solution(number, limit, power));

	}
	
	public static int solution(int number, int limit, int power) {
		List<Integer> newList = new ArrayList<>();
		
		for (int i=1; i<=number; i++) {
			int primaryCnt = getPrimaryCnt(i);
			System.out.println("개수 " + primaryCnt);
			if (primaryCnt > limit) {
				newList.add(power);
			} else {
				newList.add(primaryCnt);				
			}
		}
		
		int result = 0;
		for (Integer i : newList) {
			result += i;
		}
		
		return result;
	}
	
	private static int getPrimaryCnt(int num) {
		int result = 0;
		
		for (int i=1; i*i <= num; i++) {
			if (i*i == num) {
				result++;
			} else if (num % i == 0) {
				result += 2;
			}
		}
		return result;
	}

}
