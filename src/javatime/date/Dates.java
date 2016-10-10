package javatime.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Dates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate later = now.plusDays(7);

//        System.out.println(Duration.between(now, later));

        System.out.println(Period.between(now, later));

        System.out.println(Period.between(now, later.plusMonths(3).plusYears(5)));

        System.out.println(Period.between(now, later).get(ChronoUnit.MONTHS));
    }
}
