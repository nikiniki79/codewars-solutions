public class Troll {
    public static String disemvowel(String str) {
        String strNew = str.replaceAll(("[aiueoAIUEO]"), "");
        return strNew;
    }
}
