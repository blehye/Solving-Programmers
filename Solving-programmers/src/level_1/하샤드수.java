package level_1;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 10;
		boolean result = solution(x);
		System.out.println(result);
	}

	public static boolean solution(int x) {
		String str = Integer.toString(x);
		
		int devide_num = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int each_num = Integer.parseInt(str.substring(i, i + 1));
			devide_num += each_num;
		}
		
		if (x % devide_num == 0) {
			return true;
		} else {
			return false;
		}
	}

}
