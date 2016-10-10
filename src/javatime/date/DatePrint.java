package javatime.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePrint {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        DateTimeFormatter nederlands = DateTimeFormatter.ofPattern("d-M-yyyy");
        System.out.println(now.format(nederlands));

        DateTimeFormatter english = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(now.format(english));

        DateTimeFormatter lekkerCompleet = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy");
        System.out.println(now.format(lekkerCompleet));

        DateTimeFormatter metWatTekst = DateTimeFormatter.ofPattern("d'de dag van' MMMM yyyy");
        System.out.println(now.format(metWatTekst));
    }
}
