package level_1;

public class 체육복 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		int result = solution(n, lost, reserve);
		System.out.println(result);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int[] people = new int[n + 2];

		for (int l : lost) {
			people[l]--;
		}
		for (int r : reserve) {
			people[r]++;
		}

		for (int i = 1; i < people.length - 1; i++) {
			if (people[i] == -1) {
				if (people[i - 1] == 1) {
					people[i]++;
					people[i - 1]--;
				} else if (people[i + 1] == 1) {
					people[i]++;
					people[i + 1]--;
				} else {
					answer--;
				}

			}
		}
		return answer;
	}

}
