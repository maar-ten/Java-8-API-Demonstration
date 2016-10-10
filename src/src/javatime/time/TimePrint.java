package src.javatime.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePrint {
    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("mm 'minuten en' HH 'uur'")));
    }
}
