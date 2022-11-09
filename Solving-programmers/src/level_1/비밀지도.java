package level_1;

import java.util.Arrays;

public class 비밀지도 {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		String[] result = solution(n, arr1, arr2);
		System.out.println(Arrays.toString(result));

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] result = new String[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			String temp =  Integer.toBinaryString(arr1[i] | arr2[i]);
			
			if(temp.length() != n) {
				temp = "0".repeat(n-temp.length()) + temp; 
			}
			
			String sol = "";
			
			for(int j=0; j<temp.length(); j++) {
				if(temp.charAt(j) == '1') {
					sol += '#';
				}
				if(temp.charAt(j) == '0') {
					sol += ' ';
				}
			}
			result[i] = sol;
		}
		
		return result;
	}

}
