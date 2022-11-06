package level_1;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "one4seveneight";
		long result = solution(s);
		System.out.println(result);
	}

	public static long solution(String s) {
		String result = "";

		String figure = "";

		for (int i = 0; i < s.length(); i++) {
			if ((int) s.substring(i, i + 1).charAt(0) <= 57) {
				result += s.substring(i, i + 1);

				switch (figure) {
				case "zero":
					result += "0";
					figure = "";
					break;
				case "one":
					result += "1";
					figure = "";
					break;
				case "two":
					result += "2";
					figure = "";
					break;
				case "three":
					result += "3";
					figure = "";
					break;
				case "four":
					result += "4";
					figure = "";
					break;
				case "five":
					result += "5";
					figure = "";
					break;
				case "six":
					result += "6";
					figure = "";
					break;
				case "seven":
					result += "7";
					figure = "";
					break;
				case "eight":
					result += "8";
					figure = "";
					break;
				case "nine":
					result += "9";
					figure = "";
					break;
				}

			} else {
				figure += s.substring(i, i + 1);

				switch (figure) {
				case "zero":
					result += "0";
					figure = "";
					break;
				case "one":
					result += "1";
					figure = "";
					break;
				case "two":
					result += "2";
					figure = "";
					break;
				case "three":
					result += "3";
					figure = "";
					break;
				case "four":
					result += "4";
					figure = "";
					break;
				case "five":
					result += "5";
					figure = "";
					break;
				case "six":
					result += "6";
					figure = "";
					break;
				case "seven":
					result += "7";
					figure = "";
					break;
				case "eight":
					result += "8";
					figure = "";
					break;
				case "nine":
					result += "9";
					figure = "";
					break;
				}
			}
		}
		return Long.parseLong(result);
	}

}
