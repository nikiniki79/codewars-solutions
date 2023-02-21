import java.util.*;

public class Kata {
  public static String reverseWords(final String original) {
    if (original.isBlank()) {
      return original;
    }
    String[] arr = original.split(" ");
    ArrayList < String > list = new ArrayList < String > ();
    for (int i = 0; i < arr.length; i++) {
      String reversedStr = "";
      char ch;
      for (int j = 0; j < arr[i].length(); j++) {
        ch = arr[i].charAt(j);
        reversedStr = ch + reversedStr;
      }
      list.add(reversedStr);
    }
    return String.join(" ", list);
  }
}