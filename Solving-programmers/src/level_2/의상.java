package level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = { { "1", "red" }, { "2", "red" }, { "3", "red" }, { "1", "green" }, { "2", "green" },
                { "1", "blue" } };
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        for (String[] item : clothes) {
            List<String> valueList = new ArrayList<>();
            if (map.containsKey(item[1])) {
                valueList = map.get(item[1]);
                valueList.add(item[0]);
            } else {
                valueList.add(item[0]);
            }
            map.put(item[1], valueList);
        }

        int result = 1;
        for (String key : map.keySet()) {
            List valueList = map.get(key);
            result *= (valueList.size() + 1);
        }
        return result - 1;
    }
}
