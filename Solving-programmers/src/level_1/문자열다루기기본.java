package level_1;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		boolean result = solution(s);
		System.out.println(result);
	}

	public static boolean solution(String s) {
		boolean flag = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) == false) {
				flag = false;
			}
		}
		
		if ((s.length() == 4 || s.length() == 6) && flag) {
			return true;
		}
		
		return false;
	}

}
