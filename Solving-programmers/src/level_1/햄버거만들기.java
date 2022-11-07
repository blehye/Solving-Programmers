package level_1;

import java.util.ArrayList;

public class 햄버거만들기 {

	public static void main(String[] args) {

		int[] ingredient = { 1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1 };
		int result = solution(ingredient);
		System.out.println("정답:" + result);
	}

	public static int solution(int[] ingredient) {
		// 빵,야채,고기,빵 = 1,2,3,1 한 세트이다.
		// 배열 앞에서부터 1,2,3,1 한 세트가 나오면 카운트 1한다. 없다면 result=0
		// 1,2,3,1 한 세트를 제거 한 배열을 새로 만든다.
		// 새로 만든 배열 앞에서부터 또 1,2,3,1 한 세트가 나오면 카운트 1한다. 없다면 result=cnt

		// 1,2,3,1 한 세트를 제거하기 쉽도록 ingredient 배열을 ArrayList에 복사한다.
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < ingredient.length; i++) {
			list.add(ingredient[i]);
		}

		int cnt = 0; // 1,2,3,1 한 세트가 나올때마다 카운트업
		int index = 0; // 1,2,3,1 한 세트를 만나면 제거해야하니까 첫번째 1의 인덱스를 저장
		boolean isFinish = false; // 1,2,3,1 한 세트를 더이상 만나지 않으면 true로 바꾸기
		int listIndex = 0;

		while (!isFinish) {
			if (list.size() == 0) {
				isFinish = true;
				break;
			}
			for (int i = listIndex; i < list.size(); i++) {
				if ((int) list.get(i) == 1 && (int) list.get(i + 1) == 2 && (int) list.get(i + 2) == 3
						&& (int) list.get(i + 3) == 1 && i <= list.size() - 4) {
					cnt++;
					index = i;
					list.remove(index);
					list.remove(index);
					list.remove(index);
					list.remove(index);
					if (i >= 2) {
						listIndex = i - 2; //한세트 제거하고 index 0번으로 가는게 아니라 index-2번으로 감
					} else {
						listIndex = 0;
					}
					break;
				}
				if (i >= list.size() - 4) {
					isFinish = true;
					break;
				}
			}
		}
		int answer = cnt;
		return answer;
	}

}
