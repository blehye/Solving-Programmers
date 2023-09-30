package level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 기능개발 {

    public static void main(String[] args) {

        int[] progresses = { 93, 30, 55 };
        int[] speeds = { 1, 30, 5 };

        System.out.println(solution(progresses, speeds));

    }

    private static List solution(int[] progresses, int[] speeds) {
        List<Integer> p = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List s = Arrays.stream(speeds).boxed().collect(Collectors.toList());
        List r = new ArrayList<>();

        // Queue<Integer> q = new LinkedList<>();

        while (p.size() > 0) {
            for (int i = 0; i < s.size(); i++) {
                p.set(i, (int) p.get(i) + (int) s.get(i));
            }

            int num = 0;
            for (int i = 0; i < p.size(); i++) {
                if ((int) p.get(i) >= 100) {
                    num++;
                } else {
                    break;
                }
            }

            if (num > 0) {
                r.add(num);
                p.subList(0, num).clear();
                s.subList(0, num).clear();
            }
        }

        return r;
    }

}
