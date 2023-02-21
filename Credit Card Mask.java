public class Maskify {
    public static String maskify(String str) {
      if (str.length() > 4) {
        int x = str.length() - 4;
        String y = "";
        for (int i = 0; i < x; i++) {
          y += "#";
        }
        String res = y + "" + str.substring(x);
        return res;
      }
      return str;
    }
  }