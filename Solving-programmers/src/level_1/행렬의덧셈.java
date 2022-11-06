package level_1;

public class 행렬의덧셈 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		int[][] result = solution(arr1, arr2);
		System.out.println(result);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int i2 = i; i2 <= i; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					for (int j2 = j; j2 <= j; j2++) {
						arr2[i2][j2] = arr2[i2][j2] + arr1[i][j];
						break;
					}
				}
				break;
			}
		}
		return arr2;
	}

}
