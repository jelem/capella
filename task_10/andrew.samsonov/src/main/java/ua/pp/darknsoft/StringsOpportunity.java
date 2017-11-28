package ua.pp.darknsoft;

public class StringsOpportunity {

  public static String replacementOfSymbols(String string) {
    return string.replace("@", "[ at ]").replace(".", "[ dot ]");
  }

  public static String numericValueOfSymbols(String string) {
    return "" + string.charAt(0) + (string.length() - 2) + string.charAt(string.length() - 1);
  }

  public static int palindrome(String string) {
    int count = 0;
    String[] strArray = getArray(string, ",");
    for (int i = 0; i < strArray.length; i++) {
      StringBuilder strBuilder = new StringBuilder(strArray[i]).reverse();
      if (strArray[i].equals(strBuilder.toString())) {
        count++;
      }
    }
    return count;
  }

  public static String[] getArray(String string, String ch) {
    String[] strArray = string.split(ch);
    for (int i = 0; i < strArray.length; i++) {
      strArray[i] = strArray[i].trim();
    }
    return strArray;
  }

  public static void main(String[] args) {
    String[] testSplit = getArray("internationalization localization cat elephant monitor", " ");
    for (String str : testSplit) {
      System.out.println(numericValueOfSymbols(str));
    }
  }


}
