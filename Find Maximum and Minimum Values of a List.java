public class Kata {

    public int min(int[] list) {
      int smallest = list[0];
      for (Integer val : list) {
        if (smallest > val) {
          smallest = val;
        }
      }
      return smallest;
    }
    
    public int max(int[] list) {
      int biggest = list[0];
      for (Integer val : list) {
        if (biggest < val) {
          biggest = val;
        }
      }
      return biggest;
    }
  }
