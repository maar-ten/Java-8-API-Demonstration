package src.javatime.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeCreate {

    public static void main(String[] args) {
        System.out.println(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));
        System.out.println(LocalTime.of(12, 24));
        System.out.println(LocalTime.parse("13:24"));
    }
}
