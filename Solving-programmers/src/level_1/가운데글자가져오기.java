package level_1;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		String s = "abcde";
		String result = solution(s);
		System.out.println(result);
	}

	public static String solution(String s) {
		int index = 0;
		String result = "";

		if (s.length() % 2 != 0) {
			index = (s.length() - 1) / 2;
			result = s.substring(index, index + 1);
		} else {
			index = s.length() / 2;
			result = s.substring(index - 1, index + 1);
		}

		return result;
	}

}
