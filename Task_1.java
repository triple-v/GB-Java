public class Task_1 {
  public static void main(String[] args) {
    System.out.println(Palindrome("шалаш"));
  }

  public static Boolean Palindrome(String text) {
    return text.equals((new StringBuilder(text)).reverse().toString());
  }
}