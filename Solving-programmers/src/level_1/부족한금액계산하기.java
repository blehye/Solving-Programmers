package level_1;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long result = solution(price, money, count);
		System.out.println(result);
	}

	public static long solution(int price, int money, int count) {
		long sum = 0;
		for (int i = 1; i <= count; i++) {
			sum += price * i;
		}

		long result = 0;
		if (sum - money > 0) {
			result = sum - money;
		}

		return result;
	}

}
