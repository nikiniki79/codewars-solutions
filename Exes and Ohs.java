public class XO {
    public static boolean getXO (String str) {
      int xCount = 0;
      int oCount = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'X' || str.charAt(i) == 'x') {
          xCount++;
        }
        if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
          oCount++;
        }
      }
      if (xCount == oCount) {
        return true;
      }
      return false;
    }
  }
