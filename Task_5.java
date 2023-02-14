public class Task_5 {
  public static void main(String[] args) {
    createArray(6, 13);
  }

  public static void createArray(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = initialValue;
      System.out.print("[" + i + "]" + arr[i] + " ");
    }
  }
}
