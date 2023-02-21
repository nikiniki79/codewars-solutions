public class Kata{
    public static double find_average(int[] array){
      
      int length = array.length;
      double sum = 0;
      
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
  
      double avg = sum / length;
      return avg;
    }
  }