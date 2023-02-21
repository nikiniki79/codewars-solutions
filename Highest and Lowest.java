import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    String[] nums = numbers.split(" ");
    for (String str : nums) {
      int number = Integer.parseInt(str);
      max = Math.max(max, number);
      min = Math.min(min, number);
    }
    return max + " " + min;
  }
}