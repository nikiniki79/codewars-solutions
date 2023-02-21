public class Solution {
    public static boolean check(Object[] a, Object x) {
        Object[] arr = a.clone();
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == x) {
              return true;
          }
        }
        return false;
    }
}
