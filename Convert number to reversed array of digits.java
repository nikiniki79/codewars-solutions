public class Kata {
    public static int[] digitize(long n) {
      StringBuilder str = new StringBuilder(String.valueOf(n));
      String newStr[] = str.reverse().toString().split("");
      int arr[] = new int[newStr.length];
      for (int i = 0; i < newStr.length; i++) {
        arr[i] = Integer.parseInt(newStr[i]);
      } return arr;
    } 
  }