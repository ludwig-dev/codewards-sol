public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String[] vowels = new String[]{
                "a", "e", "i", "o", "u"
        };
       // str = str.replaceAll("\\s", "");
        str = str.replaceAll("[aeiou]", "");
        str = str.replaceAll("[AEIOU]", "");

        return str;
    }
}