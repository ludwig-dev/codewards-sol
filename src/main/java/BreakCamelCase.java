import java.util.Arrays;

public class BreakCamelCase {

    public static String camelCase(String input) {
        char[] chArr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if ((chArr[i] + "").matches("[A-Z]")) {
                sb.append(" ").append(chArr[i]);
            } else
                sb.append(chArr[i]);
        }


        return sb.toString();
    }
}
