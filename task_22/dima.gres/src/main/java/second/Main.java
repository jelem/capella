package second;

public class Main {

  public static void main(String[] args) {
    String string = "121345";
    System.out.println(isTheSameSignInString(string));
  }

  public static boolean isTheSameSignInString(String string) {
    for (int i = 0; i < string.length(); i++) {
      for (int j = 0; j < string.length(); j++) {
        if (i != j && string.charAt(i) == string.charAt(j)) {
          return true;
        }
      }
    }
    return false;
  }
}
