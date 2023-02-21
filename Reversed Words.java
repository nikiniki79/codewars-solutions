import java.util.*;

public class ReverseWords{
  public static String reverseWords(String str){
    String[] result = str.split(" ");
    Collections.reverse(Arrays.asList(result));
    String s = "";
    for (int i = 0; i < result.length; i++) {
      s += result[i] + " ";
    }
    return s.trim();
 }
}