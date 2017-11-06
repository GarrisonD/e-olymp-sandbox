package garrisond.problems.problem60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

// http://algolist.manual.ru/maths/geom/polygon/area.php

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final List<Dot> dots = new ArrayList<>();
    final int dotsCount = scanner.nextInt();

    for (int dotsIndex = 0; dotsIndex < dotsCount; dotsIndex++) {
      dots.add(new Dot(
        scanner.nextDouble(),
        scanner.nextDouble()
      ));
    }

    dots.add(dots.get(0));

    double sum = 0;

    for (int dotsIndex = 0; dotsIndex < dotsCount; dotsIndex++) {
      final Dot currentDot = dots.get(dotsIndex);
      final Dot nextDot = dots.get(dotsIndex + 1);

      sum += (currentDot.x + nextDot.x) * (currentDot.y - nextDot.y);
    }

    final double result = abs(sum) / 2.;

    System.out.printf("%.3f", result);
  }

  private static class Dot {
    private final double x;
    private final double y;

    private Dot(double x, double y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return String.format(
        "X=%.3f; Y=%.3f",
        this.x, this.y
      );
    }
  }
}
