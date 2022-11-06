package level_1;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String result = solution(participant, completion);
		System.out.println(result);
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap();

		for (String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0) + 1);
		}

		for (String c : completion) {
			hm.put(c, hm.get(c) - 1);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}

		return answer;

	}

}
