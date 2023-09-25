package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class 카드뭉치 {

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(cards1, cards2, goal));
	}
	
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		List<String> cards1Arr = new ArrayList<>(Arrays.asList(cards1));
		List<String> cards2Arr = new ArrayList<>(Arrays.asList(cards2));
		List<String> goalArr = new ArrayList<>(Arrays.asList(goal));
		
		boolean result = false;
		
		int idx = 0;
		Iterator<String> iterator = goalArr.iterator();
		
		while (iterator.hasNext()) {
		    String goalItem = iterator.next();
		    if (cards1Arr.size() > 0 && goalItem.equals(cards1Arr.get(0))) {
				iterator.remove();
				cards1Arr.remove(0);
				idx++;
			} else if (cards2Arr.size() > 0 && goalItem.equals(cards2Arr.get(0))) {
				iterator.remove();
				cards2Arr.remove(0);
				idx++;
			} else {
				break;
			}
		}
		
		if (idx == goal.length) result = true;
		
		if (result) {
			return "Yes";
		} else {
			return "No";
		}
	}

}
