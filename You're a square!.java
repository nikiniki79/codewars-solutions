import java.lang.Math;

public class Square {    
    public static boolean isSquare(int n) { 
      if (n % Math.sqrt(n) == 0 || n == 0) {
        return true;
      }
       return false;
    }
}
