public class NumberFun {
    public static long findNextSquare(long sq) {
      if (Math.sqrt(sq) % 1 == 0) {
        double x = Math.floor(Math.sqrt(sq)) + 1;
        return (long)x * (long)x;
      } else {
        return -1;
      }
    }
  }