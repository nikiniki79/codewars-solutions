public class FindOdd {
	public static int findIt(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[j] == a[i]) {
          count++;
        }
      }
      if (count % 2 != 0) {
        return a[i];
      }
    }
    return 0;
  }
}