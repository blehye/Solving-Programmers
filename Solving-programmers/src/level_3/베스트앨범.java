package level_3;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = { "classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 600, 150, 800, 2500 };
        System.out.println(solution(genres, plays));
    }

    private static List<Integer> solution(String[] genres, int[] plays) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, List<Map<Integer, Integer>>> map2 = new HashMap<>();

        int idx = 0;
        for (String genre : genres) {
            List<Map<Integer, Integer>> valueList = new ArrayList<>();
            int cnt = 0;
            if (map1.containsKey(genre)) {
                cnt = map1.get(genre);
                cnt += plays[idx];
                valueList = map2.get(genre);

                Map<Integer, Integer> map = new HashMap<>();
                map.put(idx, plays[idx]);
                valueList.add(map);
                map1.put(genre, cnt);
                map2.put(genre, valueList);
            } else {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(idx, plays[idx]);
                valueList.add(map);
                map1.put(genre, plays[idx]);
                map2.put(genre, valueList);
            }
            idx++;
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map1.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<String> sortedKeys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedKeys.add(entry.getKey());
        }

        List<Integer> result = new ArrayList<>();

        for (String key : sortedKeys) {
            List<Map<Integer, Integer>> valueList = map2.get(key);

            List<Integer> list = new ArrayList<>();

            Collections.sort(valueList, new Comparator<Map<Integer, Integer>>() {
                @Override
                public int compare(Map<Integer, Integer> o1, Map<Integer, Integer> o2) {
                    Integer value1 = o1.values().iterator().next();
                    Integer value2 = o2.values().iterator().next();
                    return value2.compareTo(value1);
                }
            });

            for (Map<Integer, Integer> map : valueList) {
                Integer k = map.keySet().iterator().next();
                list.add(k);
            }

            result.add(list.get(0));

            if (list.size() >= 2) {
                result.add(list.get(1));
            }
        }

        return result;
    }
}
