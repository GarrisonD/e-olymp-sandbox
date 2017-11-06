package garrisond.problems.problem31;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int pairsCount = scanner.nextInt();
    int result = 0;

    for (int a = 0; a < pairsCount; a++) {
      final int startYear = scanner.nextInt();
      final int finishYear = scanner.nextInt();

      for (int year = startYear; year <= finishYear; year++) {
        for (Month month : Month.values()) {
          final Calendar calendar = new GregorianCalendar(
            year, month.ordinal(), 13
          );

          final boolean isFriday = calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;

          if (isFriday) {
            result++;
          }
        }
      }
    }

    System.out.println(result);
  }
}
