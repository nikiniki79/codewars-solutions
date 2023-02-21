import java.util.List;
import java.util.ArrayList;

public class Kata {  
  public static List<Object> filterList(final List<Object> list) {
    ArrayList<Object> result = new ArrayList<>();
    for (Object val : list) {
      if (val instanceof String) {
        ;
      } else {
        result.add(val);
      }
    }
    return result;
  }
}