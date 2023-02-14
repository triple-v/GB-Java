public class Task_4 {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2077));
  }

  private static boolean isLeapYear(int year) {
    if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
      return false;
    else
      return true;
  }
}