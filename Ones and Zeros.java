import java.util.*;

public class BinaryArrayToNumber {
  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    int[] arr = binary.stream().mapToInt(Integer::intValue).toArray();
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res = res * 10 + arr[i];
    }
    String str = Integer.toString(res);
    int decimal = Integer.parseInt(str, 2);
    return decimal;
  }
}