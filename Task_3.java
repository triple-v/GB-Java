public class Task_3 {
  public static void main(String[] args) {
    printString("Hell world", 13);
  }

  public static void printString(String source, int repeat) {
    for (int i = 1; i <= repeat; i++) {
      System.out.println(i + ")" + " " + source);
    }
  }
}