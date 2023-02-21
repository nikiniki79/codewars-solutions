public class Solution {
    public static String camelCase(String str) {
      if (str.isEmpty()) {
        return "";
      }
      str = str.replaceAll("\\s+"," ");
      str = str.trim();
      String[] arr = str.split(" ");
      String res = "";
      for (String val : arr) {
        val = val.substring(0, 1).toUpperCase() + val.substring(1);
        res += val;
      }
      return res;
    }
  }