public class Kata {
    public static int sum(int[] numbers) {
      if (numbers == null || numbers.length <= 1) {
        return 0;
      } else {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
          if (numbers[i] < min) {
            min = numbers[i];
          }
          if (numbers[i] > max) {
            max = numbers[i];
          }
        }
        return sum - min - max;
      }
    }
  }
