import java.util.List;

public class MixedSum {
  public int sum(List < ? > mixed) {
    int sum = 0;
    for (Object val: mixed) {
      if (val instanceof String) {
        sum += Integer.parseInt((String) val);
      } else {
        sum += (int) val;
      }
    }
    return sum;
  }
}
