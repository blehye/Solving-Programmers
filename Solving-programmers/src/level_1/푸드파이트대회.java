package level_1;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1,3,4,6};
		String result = solution(food);
		System.out.println(result);
	}

	public static String solution(int[] food) {
		// 인덱스 1번부터 2로 나눴을때 몫만큼 배치가 됨

		String str1 = "";
		String str2 = "";
		
		for(int i=1; i<food.length; i++) {
			for(int j=0; j<food[i]/2; j++) {
				str1 += i;
			}
		}
		
		for(int i=str1.length()-1; i>=0; i--) {
			str2 += str1.charAt(i);
		}
		
		return str1 + "0" + str2;
	}

}
