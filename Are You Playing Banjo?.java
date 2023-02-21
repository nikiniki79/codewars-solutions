public class Banjo {
    public static String areYouPlayingBanjo(String name) {
      char first = name.charAt(0);
      if (first == 'R') {
        return name + " plays banjo";
      } 
      if (first == 'r') {
        return name + " plays banjo";
      }
      return name + " does not play banjo";
    }
  }