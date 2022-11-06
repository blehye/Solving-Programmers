package level_1;

public class 시저암호 {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		String result = solution(s, n);
		System.out.println(result);
	}

	public static String solution(String s, int n) {
		String newStr = "";

		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {
				newStr += " ";
				continue;
			}
			if (arr[i].charAt(0) <= 90) { // 대문자

				if (arr[i].charAt(0) + n > 90) {

					char ch = (char) (arr[i].charAt(0) + n - 90 - 1 + 65);
					newStr += String.valueOf(ch);
				} else {
					char ch = (char) (arr[i].charAt(0) + n);
					newStr += String.valueOf(ch);
				}

			} else {
				if (arr[i].charAt(0) + n > 122) {
					char ch = (char) (arr[i].charAt(0) + n - 122 - 1 + 97);
					newStr += String.valueOf(ch);
				} else {
					char ch = (char) (arr[i].charAt(0) + n);
					newStr += String.valueOf(ch);
				}

			}
		}
		return newStr;
	}

}
