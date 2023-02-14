public class Task_1 {
  public static void main(String[] args) {
    System.out.println(isSumBetween10And20(13, 6));
  }

  private static boolean isSumBetween10And20(int a, int b) {
    if (a + b <= 20 && a + b > 0) {
      return true;
    } else
      return false;
  }
}