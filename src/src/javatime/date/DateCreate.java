package src.javatime.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateCreate {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2016, Month.OCTOBER, 9));

        System.out.println(LocalDate.parse("2016-10-09"));

        System.out.println(LocalDate.parse("09-10-2016", DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        LocalDate then = LocalDate.parse("21-07-2014", DateTimeFormatter.ofPattern("d-M-y"));
        LocalDate now = LocalDate.now();
    }

}
