package level_1;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String result = solution(phone_number);
		System.out.println(result);
	}

	public static String solution(String phone_number) {
		int phone_number_length = phone_number.length();
		String last_number = phone_number.substring(phone_number_length - 4, phone_number_length);
		String new_phone_number = "";
		for (int i = 0; i < phone_number_length - 4; i++) {
			new_phone_number += "*";
		}
		new_phone_number += last_number;
		return new_phone_number;
	}

}
