class Kata {
  public static String getMiddle(String word) {
    int length = word.length();
    int middle = length / 2;
    if (length % 2 == 0) {
        return word.substring(middle - 1, middle + 1);
    } else {
        return word.substring(middle, middle + 1);
    }
  }
}