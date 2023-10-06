package level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = { 7, 4, 5, 6 };
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();

        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int nowTruck = truck_weights[i];

            while (true) {
                if (que.isEmpty()) {
                    que.add(nowTruck);
                    sum += nowTruck;
                    time++;
                    break;
                } else if (que.size() == bridge_length) {
                    sum -= que.poll();
                } else {
                    if (sum + nowTruck <= weight) {
                        que.add(nowTruck);
                        sum += nowTruck;
                        time++;
                        break;
                    } else {
                        que.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}
