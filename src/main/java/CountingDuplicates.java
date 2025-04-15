import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        // Write your code here
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        char[] chArr = text.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            map.put(chArr[i], map.getOrDefault(chArr[i], 0) + 1);
        }

        int count = 0;
        for (int val : map.values()) {
            if (val > 1)
                count++;
        }
        return count;
    }
}
