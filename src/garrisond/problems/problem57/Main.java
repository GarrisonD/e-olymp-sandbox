package garrisond.problems.problem57;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final double x1 = scanner.nextDouble();
    final double y1 = scanner.nextDouble();

    final double x2 = scanner.nextDouble();
    final double y2 = scanner.nextDouble();
    final double z2 = scanner.nextDouble();

    final double result = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2, 2));

    System.out.printf("%.3f", 1. / result);
  }
}
