package level_2;

import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = { "12", "123", "1235", "567", "88" };
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            String str = phone_book[i];
            if (str.startsWith(phone_book[i + 1]) || phone_book[i + 1].startsWith(str))
                return false;

        }
        return true;
    }
}
