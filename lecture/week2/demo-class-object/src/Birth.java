import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args){ 
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate specifiedDate = LocalDate.of(2023,Month.FEBRUARY,28);

    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getYear()); // 2023
    System.out.println(d1.getMonth()); // 30
    Month result = d1.getMonth();
    System.out.println(result.getValue()); // 12
    System.out.println(d1.getDayOfMonth()); // 30
    System.out.println(d1.getDayOfWeek()); // SATURDAY (DayOfWeek)
    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek()); // FRIDAY
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear()); //209

    System.out.println(d1.plusMonths(3L)); //2024-03-30
    System.out.println(d1.plusDays(20L)); //2024-01-19
    System.out.println(d1.plusYears(3L)); //2026-12-30

    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023, 7 , 20);
    if (LocalDate.now().isAfter(effectiveDate.plusMonths(3L))) {
      expiry = true;
    }
  }
}
