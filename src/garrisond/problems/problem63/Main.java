package garrisond.problems.problem63;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long m = scanner.nextLong();
    final long n = scanner.nextLong();

    System.out.println((m - 1) * (n - 1) + 1);
  }
}
