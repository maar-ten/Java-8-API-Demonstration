package javatime.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeMutate {
    public static void main(String[] args) {
        System.out.println(LocalTime.now().plusMinutes(10).truncatedTo(ChronoUnit.MINUTES));
    }
}
