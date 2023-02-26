
import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Boolean nonStop = true;

    while (nonStop) {
      System.out.println();
      String[] userInput = getUserInput(scan).split("~");

      if (userInput[0].equals("print")) {
        System.out.println(getData(list, userInput[1]));
      } else if (userInput[0].equals("q")) {
        nonStop = false;
      } else {
        saveData(list, userInput);
      }
    }
  }

  public static String getUserInput(Scanner scan) {
    System.out.print("Enter text~num: ");
    System.out.println("Enter 'q' to exit.");
    return scan.nextLine();
  }

  public static void saveData(ArrayList<String> list, String[] array) {
    int temp = valueCheck(list, array[1]);

    if (temp == -1) {
      list.add(array[1]);
      list.add(array[0]);
    } else {
      list.remove(temp);
      list.add(temp, array[0]);
    }
  }

  public static String getData(ArrayList<String> list, String key) {
    int index = valueCheck(list, key);
    if (index == -1) {
      return " ";
    }
    return list.get(index);
  }

  public static int valueCheck(ArrayList<String> list, String key) {
    for (int i = 0; i < list.size(); i += 2) {
      if (list.get(i).equals(key)) {
        return i + 1;
      }
    }
    return -1;
  }
}
