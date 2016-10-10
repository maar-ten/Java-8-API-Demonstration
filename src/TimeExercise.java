import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Arrays;
import java.util.Date;

public class TimeExercise {
    public static void main(String[] args) {
        // initializing a LocalDate
        LocalDate now = LocalDate.of(2016, Month.MARCH, 24);
        System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));

        Date date = new Date();

        // adding days
        LocalDate tomorrow = now.plus(1, ChronoUnit.DAYS);
        System.out.println(tomorrow);

        // parsing en getting
        LocalDate parsedDate = LocalDate.parse("20110105", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parsedDate);
        System.out.println(parsedDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));

        // fluent api
        System.out.println(LocalDate.now().isLeapYear());

        System.out.println(now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));

        // answers
        // 1. LocalDateTime
        // 2. LocalDate(xxx).with(TemporalAdjusters.previous(DayOfWeek.THURSDAY))
        // 3. ZoneId is sort of a textual representation of a ZoneOffset
        // 4. ?

        // exercise
        // 1
        printMonthsLength(2016);

        // 2
        printMondays(Month.MARCH);

        // 3
        isFriday13th("2016-05-13");
    }

    private static void printMonthsLength(int year) {
        int[] monthsLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        LocalDate date = LocalDate.of(year, Month.FEBRUARY, 1);
        if (date.isLeapYear()) {
            monthsLength[1] = 29;
        }

        Arrays.stream(monthsLength).forEach(System.out::println);
    }

    private static void printMondays(Month month) {
        LocalDate monday = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        while (monday.getMonth() == month) {
            System.out.println("Monday: " + monday);
            monday = monday.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }

    private static void isFriday13th(String isoDate) {
        LocalDate localDate = LocalDate.parse(isoDate);
        System.out.println(localDate.query(new FridayThirteenQuery()));
    }

}

class FridayThirteenQuery implements TemporalQuery<Boolean> {
    @Override
    public Boolean queryFrom(TemporalAccessor date) {
        return 13 == date.get(ChronoField.DAY_OF_MONTH) &&
                DayOfWeek.FRIDAY.get(ChronoField.DAY_OF_WEEK) == date.get(ChronoField.DAY_OF_WEEK);
    }
}

