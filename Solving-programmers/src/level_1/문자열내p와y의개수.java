package level_1;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "Pyy";
		boolean result = solution(s);
		System.out.println(result);
	}

	public static boolean solution(String s) {
		int cntP = 0;
		int cntY = 0;

		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i, i + 1);
			if (str.equalsIgnoreCase("p")) {
				cntP++;
			}
			if (str.equalsIgnoreCase("y")) {
				cntY++;
			}
		}

		if (cntP == cntY) {
			return true;
		} else {
			return false;
		}
	}

}
