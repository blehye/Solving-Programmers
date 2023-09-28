package level_1;

import java.util.ArrayList;
import java.util.List;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int pLen = p.length();

        List<Long> tArr = new ArrayList<>();

        int cnt = t.length() + 1 - pLen;

        for (int i=0; i<cnt; i++) {
            tArr.add(Long.parseLong(t.substring(i, i + pLen))); 
        }

        int result = 0;

        for (Long num : tArr) {
            if (Long.parseLong(p) >= num) result++;
        }

        return result;
    }
}
