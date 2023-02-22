import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task_1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = getRandomList(15, 30);
    System.out.printf("Список до удаления чётных чисел: %s\n", numbers.toString());
    System.out.printf("Список после удаления чётных чисел: %s", listEditor(numbers).toString());
  }

  private static ArrayList<Integer> listEditor(ArrayList<Integer> list) {

    Iterator<Integer> iteratorList = list.iterator();

    while (iteratorList.hasNext()) {
      int item = iteratorList.next();
      if (item % 2 == 0)
        iteratorList.remove();
    }
    return list;
  }

  private static ArrayList<Integer> getRandomList(int size, int upperBond) {
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
      list.add(rand.nextInt(upperBond));
    }
    return list;
  }
}