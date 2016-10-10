package javatime.time;

import java.time.Duration;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime later = now.plusMinutes(10).plusHours(5);

        Duration between = Duration.between(now, later);
        System.out.println(between);

        System.out.println(between.toMinutes());
    }
}
