package level_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class 숫자짝꿍 {

	public static void main(String[] args) {
		String X = "000000000000000100000";
		String Y = "0000000000000001111111111111100000";
		
		String result = solution(X, Y);
		System.out.println("정답 : "+result);
	}

	public static String solution(String X, String Y) {
		
		HashMap<String,Integer> mapX = new HashMap();
		HashMap<String,Integer> mapY = new HashMap();
		
		for(int i=0; i<X.length(); i++) {
			if(mapX.get(X.charAt(i)+"") == null) {
				mapX.put(X.charAt(i)+"" , 1);
				continue;
			}
			if(mapX.get(X.charAt(i)+"") != null) {
				mapX.put(X.charAt(i)+"", (int)mapX.get(X.charAt(i)+"")+1);
			}
		}
		
		for(int i=0; i<Y.length(); i++) {
			if(mapY.get(Y.charAt(i)+"") == null) {
				mapY.put(Y.charAt(i)+"" , 1);
				continue;
			}
			if(mapY.get(Y.charAt(i)+"") != null) {
				mapY.put(Y.charAt(i)+"", (int)mapY.get(Y.charAt(i)+"")+1);
			}
		}
		
		HashMap<String,Integer> mapRep = new HashMap();
		HashMap<String,Integer> mapRel = new HashMap();
		HashMap<String,Integer> mapResult = new HashMap();
		
		mapRep = mapX.size() > mapY.size() ? mapX : mapY;
		mapRel = mapX.size() > mapY.size() ? mapY : mapX;
		
		for (String key : mapRep.keySet()) {
			if(mapRel.get(key) == null) {
				continue;
			}
			if(mapRel.get(key) != null && (mapRel.get(key) > mapRep.get(key))) {
				mapResult.put(key, mapRep.get(key));
				
			}
			if(mapRel.get(key) != null && (mapRel.get(key) <= mapRep.get(key))) {
				mapResult.put(key, mapRel.get(key));			
			}
	    }
		
		ArrayList<String> resultArr = new ArrayList();
		
		for(String i : mapResult.keySet()) { 
		    resultArr.add(i.repeat(mapResult.get(i)));
		}
		
		resultArr.sort(Comparator.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < resultArr.size(); i++) {
            stringBuilder.append(resultArr.get(i));
        }
        
        String result = stringBuilder.toString();
		
		if(result.equals("")) {
			result = "-1";
		}
		
		for(int i=0; i<result.length(); i++) {
			if(result.charAt(i) != '0') {
				break;
			}
			if(i == (result.length()-1)) {
				result = "0";
			}
		}

		String answer = result;
		return answer;

	}

}
