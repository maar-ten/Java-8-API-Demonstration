package javatime.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateMutate {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate later = now.plusDays(7);
        System.out.println(later);

        LocalDate yesterday = now.plus(-1, ChronoUnit.DAYS);
        System.out.println(yesterday.toString());

        LocalDate alsoYesterday = now.minusDays(1);
        System.out.println(alsoYesterday);

        LocalDate todayLastYear = now.plusDays(7).minusYears(1);
        System.out.println(todayLastYear);
    }

}
