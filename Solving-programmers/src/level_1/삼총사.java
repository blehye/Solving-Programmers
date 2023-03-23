package level_1;

public class 삼총사 {

	public static void main(String[] args) {
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		int answer = solution(number);
		System.out.println(answer);

	}
	
	public static int solution(int[] number) {
		
		/*
		 * 배열이 있다면? 배열에서 3개의 수로 조합 가능한 전체 경우의 수가 정해진다
		 * 전체 경우의 수에서 3개의 수의 합이 0인 경우를 카운트하면 됨
		 * 비교할 3개의 수를 각각 x, y, z 라고 하자
		 * (1) x는 첫번째 원소, y는 2번째 원소, z는 3번째 원소부터 마지막 원소까지 반복문을 돌려 x + y + z = 0 인 경우를 카운트한다. 
		 * (2) y인덱스 +1 한다.
		 * (2) x는 첫번째 원소, y는 3번째 원소, z는 4번째 원소부터 마지막 원소까지 반복문을 돌려 x + y + z = 0 인 경우를 카운트한다. 
		 * (3) y의 인덱스가 배열크기-2가 되면 x인덱스를 +1 한다.
		 * (4) x는 2번째 원소, y는 3번째 원소, z는 4번째 원소가 된다. 반복.
		 * */
		
		int len = number.length;
		
		int cnt = 0;
		
		int xInit = 0;
		int yInit = 1;
		int zInit = 2;
		
		for(int x=xInit; x<=len-3; x++) {
			for(int y=yInit; y<=len-2; y++) {
				for(int z=zInit; z<=len-1; z++) {
					if((number[x]+number[y]+number[z]) == 0) cnt++;
				}
				zInit++;
				yInit++;
			}
			xInit++;
			yInit = xInit + 1;
			zInit = xInit + 2;

		}
		
        int answer = cnt;
        return answer;
    }

}
