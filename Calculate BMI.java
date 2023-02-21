public class Calculate {
    public static String bmi(double weight, double height) {
      double res = (weight / (height * height));
      if (res <= 18.5) {
        return "Underweight";
      }
      if (res <= 25.0) {
        return "Normal";
      }
      if (res <= 30.0) {
        return "Overweight";
      }
      return "Obese";
    }
  }
