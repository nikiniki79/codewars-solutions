public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
      StringBuilder str = new StringBuilder(letters);
      for (int i = 0; i < coords.length; i++) {
        str = str.deleteCharAt(coords[i]);
      }
      return str.toString();
    }
  }