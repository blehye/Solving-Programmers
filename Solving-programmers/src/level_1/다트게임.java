package level_1;

public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int result = solution(dartResult);
		System.out.println(result);
	}

	public static int solution(String dartResult) {
		String temp = "";
		int arr[] = new int[3];
		int index = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			switch (dartResult.charAt(i)) {
			case 'S':
				arr[index] = Integer.parseInt(temp);
				index++;
				temp = "";
				break;
			case 'D':
				arr[index] = Integer.parseInt(temp) * Integer.parseInt(temp);
				index++;
				temp = "";
				break;
			case 'T':
				arr[index] = Integer.parseInt(temp) * Integer.parseInt(temp) * Integer.parseInt(temp);
				index++;
				temp = "";
				break;
			case '*':
				arr[index - 1] *= 2;
				if (index > 1) {
					arr[index - 2] *= 2;
				}
				break;
			case '#':
				arr[index - 1] *= -1;
				break;
			default:
				temp += String.valueOf(dartResult.charAt(i));
				break;
			}
		}

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}

		return result;
	}

}
