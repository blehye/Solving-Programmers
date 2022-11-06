package level_1;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world";
		String result = solution(s);
		System.out.println(result);
	}

	public static String solution(String s) {

		String[] arr = s.split(" ", -1);

		String result = "";
		for (int i = 0; i < arr.length; i++) {
			String newWord = "";
			String alpha = "";
			for (int j = 0; j < arr[i].length(); j++) {

				if (j % 2 == 0) {
					alpha = arr[i].substring(j, j + 1).toUpperCase();

					newWord += alpha;

				} else if (j % 2 == 1) {
					alpha = arr[i].substring(j, j + 1).toLowerCase();

					newWord += alpha;
				}
			}
			result += newWord;
			result += " ";
		}
		return result.substring(0, result.length() - 1);
	}

}
