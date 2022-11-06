package level_1;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String result = solution(s);
		System.out.println(result);
	}

	public static String solution(String s) {
		String[] strArr = s.split("");
		Integer[] intArr = new Integer[s.length()];

		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = (int) strArr[i].charAt(0);
		}

		Arrays.sort(intArr, Collections.reverseOrder());

		String result = "";

		for (int i = 0; i < intArr.length; i++) {
			char ch = (char) intArr[i].intValue();
			String str = Character.toString(ch);
			result += str;
		}

		return result;
	}

}
