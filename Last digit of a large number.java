import java.math.BigInteger;

public class Kata {
  public static int lastDigit(BigInteger n1, BigInteger n2) { 
      return n1.modPow(n2, BigInteger.TEN).intValue();
  }      
}