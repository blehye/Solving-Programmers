package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 둘만의암호 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s, skip, index));

    }

    public static String solution(String s, String skip, int index) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char newChar = chkSkip(c, skip, index);
            result += newChar;
        }

        return result;
    }

    private static char chkSkip(char c, String skip, int index) {
        String[] skipArr = skip.split("");

        List<String> skipList = new ArrayList<>(Arrays.asList(skipArr));

        char newChar = c;
        for (int i = 1; i <= index; i++) {
            if (newChar == 'z') {
                newChar = 'a';
            } else {
                newChar = (char) (newChar + 1);
            }
            if (skipList.contains(String.valueOf(newChar))) {
                index++;
            }
        }

        return newChar;
    }

}
