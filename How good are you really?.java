public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
      // Your code here
      int[] arr = classPoints.clone();
      int x = 0;
      int y = 0;
      for (int i = 0; i < arr.length; i++) {
        x += arr[i]; 
        y += 1;
      }
      int avgPoints = x / y;
      if (yourPoints > avgPoints) {
        return true;
      }
      return false;
    }
  }
