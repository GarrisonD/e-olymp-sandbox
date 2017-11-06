package garrisond.problems.problem66;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int visitorsCount = scanner.nextInt();

    scanner.useDelimiter("(:|\\s)");

    List<LocalTimeRange> localTimeRanges = new ArrayList<>();

    for (int visitorIndex = 0; visitorIndex < visitorsCount; visitorIndex++) {
      final LocalTime start = LocalTime.of(
        scanner.nextInt(), scanner.nextInt()
      );

      final LocalTime finish = LocalTime.of(
        scanner.nextInt(), scanner.nextInt()
      );

      localTimeRanges.add(
        new LocalTimeRange(
          start, finish
        )
      );
    }

    int result = 0;

    for (int a = 0; a < visitorsCount; a++) {
      boolean success = true;

      for (int b = 0; b < visitorsCount; b++) {
        if (a != b) {
          if (localTimeRanges.get(b).isParent(localTimeRanges.get(a))) {
            success = false;
            break;
          }
        }
      }

      if (success) result++;
    }

    System.out.println(result);
  }

  private static class LocalTimeRange {
    private final LocalTime start;
    private final LocalTime finish;

    private LocalTimeRange(LocalTime start, LocalTime finish) {
      this.start = start;
      this.finish = finish;
    }

    private boolean isParent(LocalTimeRange localTimeRange) {
      return (start.isBefore(localTimeRange.start) || start.equals(localTimeRange.start))
        && (finish.isAfter(localTimeRange.finish) || finish.equals(localTimeRange.finish));
    }
  }
}
