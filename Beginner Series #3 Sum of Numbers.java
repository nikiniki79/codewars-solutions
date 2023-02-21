public class Sum {
    public int GetSum(int a, int b) {
      int result = 0;
      if(a > b){
        while(a >= b){
          result += b;
          b++;
        }
      }
      else if(a < b){
        while(a <= b){
          result += a;
          a++;
        }
      }
      else {
        result = a;
      }
      return result;
    }
  }
