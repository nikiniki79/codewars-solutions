public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
      String[] arr = name.split(" ");
      String str = name.substring(0, 1).toUpperCase() + ".";
      str += arr[1].substring(0, 1).toUpperCase();
      return str;
    }
  }