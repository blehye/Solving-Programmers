package level_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 추억점수 {

	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		
		solution(name, yearning, photo);

	}
	
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		
		Map map = new HashMap();
		for(int i=0; i<name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		System.out.println(map);
		
		List list = new ArrayList();
		
		for(int i=0; i<photo.length; i++) {
			int cnt = 0;
			System.out.println(i);
			for(int j=0; j<photo[i].length; j++) {
				if(map.get(photo[i][j]) != null) {
					cnt += (int) map.get(photo[i][j]);					
				}
			}
			
			list.add(cnt);
		}
		
		System.out.println(list);
		
		
        int[] answer = {};
        return list;
    }

}

