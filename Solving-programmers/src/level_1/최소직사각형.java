package level_1;

import java.util.Arrays;

public class 최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int result = solution(sizes);
		System.out.println(result);

	}

	public static int solution(int[][] sizes) {

		// 가로길이 저장할 배열
		int[] width = new int[sizes.length];

		// 세로길이 저장할 배열
		int[] height = new int[sizes.length];

		for (int i = 0; i < sizes.length; i++) {
			//가로, 세로 중에서 큰 값을 선택해서 가로 배열에 넣기
			width[i] = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1]; 
			
			//가로, 세로 중에서 작은 값을 선택해서 세로 배열에 넣기
			height[i] = sizes[i][0] < sizes[i][1] ? sizes[i][0] : sizes[i][1];
		}

		Arrays.sort(width);
		Arrays.sort(height);

		int maxWidth = width[sizes.length-1];
		int maxHeight = height[sizes.length-1];

		int answer = maxWidth * maxHeight;
		return answer;
	}

}
