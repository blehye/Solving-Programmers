package level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = { 1, 1, 9, 1, 1, 1 };
        int location = 0;
        System.out.println(solution(priorities, location));
    }

    private static int solution(int[] priorities, int location) {
        Queue<Map<Integer, Integer>> que = new LinkedList<>();

        int idx = 0;
        for (int i : priorities) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(idx, i);
            que.offer(map);
            idx++;
        }

        List<Integer> resultList = new ArrayList<>();

        while (resultList.size() < priorities.length) {
            Map<Integer, Integer> map = que.poll();

            // 큐에서 꺼낸 값
            int value = 0;
            for (Integer i : map.values()) {
                value = i;
            }

            // 큐를 순회하면서 우선순위가 높은값이 있는지 확인
            if (chkMajor(value, que)) {
                que.add(map);
            } else {
                for (Integer i : map.keySet()) {
                    resultList.add(i);
                }
            }
        }

        int result = 1;
        for (Integer i : resultList) {
            if (location == i) {
                return result;
            } else {
                result++;
            }
        }

        return result;
    }

    private static boolean chkMajor(int value, Queue<Map<Integer, Integer>> que) {
        boolean result = false;
        for (Map<Integer, Integer> item : que) {
            int v = 0;
            for (Integer i : item.values()) {
                v = i;
            }

            if (value < v) {
                return true;
            }
        }

        return result;
    }

}
