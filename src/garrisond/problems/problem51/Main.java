package garrisond.problems.problem51;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    for (int itemsCount = 6, partsCount = 3; true; itemsCount += ++partsCount) {
      final int finishRange = itemsCount - partsCount;
      final int startRange = finishRange - partsCount / 2;

      if (input >= startRange && input <= finishRange) {
        System.out.println(partsCount - 1);
        return;
      }

      if (input < startRange) {
        System.out.println(partsCount - 2);
        return;
      }
    }
  }
}
