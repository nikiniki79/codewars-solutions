public class SumArray {
    public static double sum(double[] numbers) {
      double sum = 0;
      for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
      if (numbers.length == 0) {
        return 0;
      } else {
        return sum;
      }
    }
  }
