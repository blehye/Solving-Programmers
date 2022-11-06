package level_1;

public class 문자열을정수로바꾸기 {

	public static void main(String[] args) {
		String s = "-1234";
		int result = solution(s);
		System.out.println(result);
	}

	public static int solution(String s) {
		if (s.substring(0, 1).equals("-")) {
			int abs = Integer.parseInt(s.substring(1));
			return abs * (-1);
		} else if (s.substring(0, 1).equals("+")) {
			int abs = Integer.parseInt(s.substring(1));
			return abs;
		} else {
			int abs = Integer.parseInt(s.substring(0));
			return abs;
		}
	}

}
