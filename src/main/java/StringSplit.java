public class StringSplit {
    public static String[] solution(String s) {
        s = s.trim();
        if (s.length() % 2 != 0) {
            s += "_";
        }

        int size = s.length() / 2;
        String[] result = new String[size];

        for (int i = 0; i < s.length(); i += 2) {
            result[i / 2] = s.substring(i, i + 2);
        }

        return result;
    }
}
