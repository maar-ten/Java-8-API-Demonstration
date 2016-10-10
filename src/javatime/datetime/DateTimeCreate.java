package javatime.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeCreate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalTime later = LocalTime.now().plusMinutes(5);

        Duration between = Duration.between(now, later);
        System.out.println(between.toMinutes());

        Duration between1 = Duration.between(later, now);
        System.out.println(between1.toMinutes());

        Duration between2 = Duration.between(LocalDate.now(), LocalDateTime.now());
        System.out.println(between2);
    }
}
