package level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 100;
        int m = 4;
        int[] section = { 2, 3, 99 };
        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        List<Integer> list = Arrays.stream(section).boxed().collect(Collectors.toList());

        int result = 0;

        while (list.size() > 0) {
            int min = (int) Collections.min(list);
            int maxPaint = min + m - 1;

            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
                Integer item = iterator.next();
                if (item <= maxPaint) {
                    iterator.remove();
                }
            }

            result++;
        }
        return result;
    }
}
