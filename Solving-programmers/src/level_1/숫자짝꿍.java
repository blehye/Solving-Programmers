package level_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class 숫자짝꿍 {

	public static void main(String[] args) {
		String X = "000000000000000100000";
		String Y = "0000000000000001111111111111100000";

		String result = solution(X, Y);
		System.out.println("정답 : " + result);
	}

	public static String solution(String X, String Y) {

		HashMap<String, Integer> mapX = new HashMap();
		HashMap<String, Integer> mapY = new HashMap();

		//X에 있는 각각의 숫자가 몇개씩 있는지 map에 key, value 형태로 저장
		for (int i = 0; i < X.length(); i++) {
			if (mapX.get(X.charAt(i) + "") == null) {
				mapX.put(X.charAt(i) + "", 1);
				continue;
			}
			if (mapX.get(X.charAt(i) + "") != null) {
				mapX.put(X.charAt(i) + "", (int) mapX.get(X.charAt(i) + "") + 1);
			}
		}

		//Y에 있는 각각의 숫자가 몇개씩 있는지 map에 key, value 형태로 저장
		for (int i = 0; i < Y.length(); i++) {
			if (mapY.get(Y.charAt(i) + "") == null) {
				mapY.put(Y.charAt(i) + "", 1);
				continue;
			}
			if (mapY.get(Y.charAt(i) + "") != null) {
				mapY.put(Y.charAt(i) + "", (int) mapY.get(Y.charAt(i) + "") + 1);
			}
		}

		HashMap<String, Integer> mapRep = new HashMap();
		HashMap<String, Integer> mapRel = new HashMap();
		HashMap<String, Integer> mapResult = new HashMap(); //공통 숫자와 각각의 개수를 추출해서 새로운 맵에 담는다.

		//mapX와 mapY의 key를 비교해서 공통적으로 가진 key만 뽑아내야하는데 그렇게 하기 위해서는 기준이 되는 map은 key의 개수가 더 많아야한다.
		mapRep = mapX.size() > mapY.size() ? mapX : mapY; //key의 개수가 상대적으로 많은 map //기준 map
		mapRel = mapX.size() > mapY.size() ? mapY : mapX; //key의 개수가 상대적으로 적은 map //상대 map

		for (String key : mapRep.keySet()) {
			//기준 map의 key값을 상대 map에서 가지지 않으면 건너뛴다.
			if (mapRel.get(key) == null) {
				continue;
			}
			//기준 map의 key값을 상대 map에서 가지면서, 상대 map의 key에 대한 value값이 더 크면, 더 적은 value(기준 map)를 선택한다.
			if (mapRel.get(key) != null && (mapRel.get(key) > mapRep.get(key))) {
				mapResult.put(key, mapRep.get(key));
			}
			//기준 map의 key값을 상대 map에서 가지면서, 상대 map의 key에 대한 value값이 더 작거나 같으면, 더 작거나 같은 value(상대 map)를 선택한다.
			if (mapRel.get(key) != null && (mapRel.get(key) <= mapRep.get(key))) {
				mapResult.put(key, mapRel.get(key));
			}
		}

		ArrayList<String> resultArr = new ArrayList();

		//mapResult에서 각각의 key에 대한 value만큼 반복한 문자열을 resultArr에 add한다.
		for (String i : mapResult.keySet()) {
			resultArr.add(i.repeat(mapResult.get(i)));
		}

		//문자열 내림차순 정렬
		resultArr.sort(Comparator.reverseOrder());

		//문자열을 이어붙일때 stringBuilder를 쓰면 시간 단축에 도움됨
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < resultArr.size(); i++) {
			stringBuilder.append(resultArr.get(i));
		}

		//String으로 형변환
		String result = stringBuilder.toString();

		//result값이 없다면 답은 -1
		if (result.equals("")) {
			result = "-1";
		}

		//result값에서 모든 숫자가 0이면 답은 0 (long형으로 파싱하는 방법 쓰면 안된다)
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != '0') {
				break;
			}
			if (i == (result.length() - 1)) {
				result = "0";
			}
		}

		String answer = result;
		return answer;

	}

}
